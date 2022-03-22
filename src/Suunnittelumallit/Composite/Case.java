package Suunnittelumallit.Composite;

import java.util.ArrayList;
import java.util.List;

public class Case implements Component{
    private double individualPrice = 89.99;
    private double price = 89.99;
    private String name = "NZXT H510 - CA-H510B-B1 - Compact ATX Mid-Tower PC Gaming Case";

    private List<Component> childComponents;

    public Case(){
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
