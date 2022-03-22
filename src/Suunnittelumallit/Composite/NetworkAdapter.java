package Suunnittelumallit.Composite;

public class NetworkAdapter implements Component{
    private double price = 104.90;
    private String name = "Asus XG-C100C, 10Gb";

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
