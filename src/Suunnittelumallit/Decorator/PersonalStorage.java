package Suunnittelumallit.Decorator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalStorage implements Storage{

    private ArrayList<String> dataList = new ArrayList<String>();

    @Override
    public void writeData(String data) {
        dataList.add(data);
    }

    @Override
    public ArrayList readData() {
        return dataList;
    }
}
