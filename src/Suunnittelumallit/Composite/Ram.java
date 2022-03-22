package Suunnittelumallit.Composite;

public class Ram implements Component{

    private double price = 89.9;
    private String name = "Corsair Vengeance 16GB DDR4 1600MHZ";

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
