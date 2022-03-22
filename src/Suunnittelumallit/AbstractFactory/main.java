package Suunnittelumallit.AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class main {
    public static void main(String[] args){
        AbstractFactory adidasFactory = null;
        AbstractFactory bossFactory = null;
        Class adidas;
        Class boss;

        Properties properties = new Properties();

        try{
            properties.load(new FileInputStream("src/Suunnittelumallit/AbstractFactory/tehdas.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            adidas = Class.forName(properties.getProperty("adidas"));
            boss = Class.forName(properties.getProperty("boss"));
            adidasFactory = (AbstractFactory)adidas.getDeclaredConstructor().newInstance();
            bossFactory = (AbstractFactory)boss.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }


        Jasper jasper = new Jasper();
        try{
            jasper.pue(adidasFactory);
            jasper.pue(bossFactory);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
