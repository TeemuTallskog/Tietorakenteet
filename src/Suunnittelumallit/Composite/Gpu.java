package Suunnittelumallit.Composite;

public class Gpu implements Component{

    private double price = 1549.99;
    private String name = "ASUS TUF Gaming NVIDIA GeForce RTX 3080 OC Edition Graphics Card";
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
