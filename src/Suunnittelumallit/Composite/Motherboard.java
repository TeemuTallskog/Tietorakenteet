package Suunnittelumallit.Composite;

public class Motherboard implements Component{

    private double price = 229.90;
    private String name = "Asus PRIME Z690-P D4, ATX-motherboard";

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
