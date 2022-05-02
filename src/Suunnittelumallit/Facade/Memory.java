package Suunnittelumallit.Facade;

import java.util.HashMap;

public class Memory {
    private static char[] ram = new char[512];
    public void load(long pos, char[] data){
        for(int i = (int) pos; i < pos + data.length; i++){
            ram[i] = data[i - (int)pos];
        }
    }
    public static char access(long pos){
        return ram[(int) pos];
    }
}
