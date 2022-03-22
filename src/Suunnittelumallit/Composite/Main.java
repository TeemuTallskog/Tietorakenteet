package Suunnittelumallit.Composite;

public class Main {
    public static void main(String[] args){
        Case aCase = new Case();
        Motherboard motherboard = new Motherboard();
        Component ram = new Ram();
        Component networkAdapter = new NetworkAdapter();
        Component processor = new Processor();
        Component gpu = new Gpu();

        motherboard.addComponent(gpu);
        motherboard.addComponent(processor);
        motherboard.addComponent(networkAdapter);
        motherboard.addComponent(ram);

        aCase.addComponent(motherboard);

        System.out.println("Computer parts: ");
        aCase.printReceipt();
        System.out.println("Total price = " + aCase.getPrice() + "€");

    }
}
