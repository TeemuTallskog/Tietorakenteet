package Suunnittelumallit.Composite;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements Component{

    private double individualPrice = 229.0;
    private double price = 229.0;
    private String name = "Asus PRIME Z690-P D4, ATX-motherboard";

    private List<Component> childComponents;

    public Motherboard(){
        this.childComponents = new ArrayList<>();
    }

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
        this.childComponents.forEach(Component::printReceipt);
        System.out.println(name + ", " + individualPrice + "€");
    }

    public void addComponent(Component component){
        this.childComponents.add(component);
        price += component.getPrice();
    }

    public void removeComponent(Component component){
        this.childComponents.remove(component);
        price -= component.getPrice();
    }
}
