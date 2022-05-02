package Suunnittelumallit.Facade;

import java.util.HashMap;

public class HardDrive {
    private char[] drive = new char[4096];
    private String s = "dosomething";

    public HardDrive(){
        for(int i = 128; i < s.length() + 128; i++){
            drive[i] = s.charAt(i-128);
        }
    }

    public char[] read(long lba, int size){
        char[] temp = new char[size];
        for(int i = (int)lba; i < size + lba; i++){
            temp[i - (int)lba] = drive[i];
        }
        return temp;
    }

}
