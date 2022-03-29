package Suunnittelumallit.Decorator;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Storage storage = new PersonalStorage();
        Storage encryptedStorage = new EncryptionDecorator(new PersonalStorage());

        boolean loop = true;
        Scanner s = new Scanner(System.in);

        while(loop){
            System.out.println("Choose action:");
            System.out.println("1. Write data");
            System.out.println("2. Read data");
            System.out.println("3. Write encrypted data");
            System.out.println("4. Read encrypted data");
            System.out.println("5. Quit");
            int selection = Integer.parseInt(s.nextLine());
            switch (selection){
                case 1:
                    System.out.println("Write your data:");
                    String data = s.nextLine();
                    storage.writeData(data);
                    break;
                case 2:
                    ArrayList<String> list = storage.readData();
                    list.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Write your data:");
                    String eData = s.nextLine();
                    encryptedStorage.writeData(eData);
                    break;
                case 4:
                    ArrayList<String> elist = encryptedStorage.readData();
                    if(elist != null){
                        elist.forEach(System.out::println);
                    }
                    break;
                case 5:
                    loop = false;
                    break;
            }
        }
    }
}
