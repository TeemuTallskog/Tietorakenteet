package Suunnittelumallit.Composite;

public class Processor implements Component{

    private double price = 474.90;
    private String name = "Intel Core i7-12700K, LGA1700, 3.60 GHz";


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printReceipt() {
        System.out.println(name + ", " + price + "€");
    }
}
