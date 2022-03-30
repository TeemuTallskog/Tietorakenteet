package Suunnittelumallit.Decorator;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

public class EncryptionDecorator extends DataDecorator{

    public EncryptionDecorator(Storage storage) {
        super(storage);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Input an 8 character key for encryption:");
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        if(password.length() != 8){
            System.out.println("Wrong password size!");
            return;
        }
        password += password;
        Key sKey = new SecretKeySpec(password.getBytes(StandardCharsets.ISO_8859_1), "AES");
        Cipher cipher;
        try{
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, sKey);
            byte[] encrypted = cipher.doFinal(data.getBytes(StandardCharsets.ISO_8859_1));
            super.writeData(new String(encrypted, StandardCharsets.ISO_8859_1));
            System.out.println("Successfully stored encrypted data");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }

    @Override
    public ArrayList readData(){
        System.out.println("Input an 8 character key for decryption:");
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        if(password.length() != 8){
            System.out.println("Wrong password size!");
            return null;
        }
        password += password;
        ArrayList<String> data = super.readData();
        ArrayList<String> temp = new ArrayList<>();
        try{
            Key sKey = new SecretKeySpec(password.getBytes(StandardCharsets.ISO_8859_1), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, sKey);
            data.forEach(str -> {
                try {
                    byte[] bytestr = str.getBytes(StandardCharsets.ISO_8859_1);
                    temp.add(new String(cipher.doFinal(bytestr)));
                } catch (IllegalBlockSizeException | BadPaddingException ignored) {
                    temp.add(str);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
        return temp;
    }
}
