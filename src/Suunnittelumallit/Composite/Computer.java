package Suunnittelumallit.Composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Component{
    private double price = 0;
    private String name;

    private List<Component> childComponents;

    public Computer(String name){
        this.name = name;
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
        System.out.println(name + "'s Components:");
        this.childComponents.forEach(component -> {
            component.printReceipt();
        });
        System.out.println("Total: " + price + "€");
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
