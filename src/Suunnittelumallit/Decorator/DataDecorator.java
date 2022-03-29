package Suunnittelumallit.Decorator;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public abstract class DataDecorator implements Storage {

    protected Storage storage;

    public DataDecorator(Storage storage){
        this.storage = storage;
    }

    @Override
    public void writeData(String data) {
        storage.writeData(data);
    }

    @Override
    public ArrayList readData() {
        return storage.readData();
    }
}
