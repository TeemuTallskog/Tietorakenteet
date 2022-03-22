package Suunnittelumallit.Composite;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer("Home PC");
        Component motherboard = new Motherboard();
        Component ram = new Ram();
        Component networkAdapter = new NetworkAdapter();
        Component processor = new Processor();

        computer.addComponent(motherboard);
        computer.addComponent(ram);
        computer.addComponent(networkAdapter);
        computer.addComponent(processor);

        System.out.println("Price of the pc = " + computer.getPrice());
        computer.printReceipt();

    }
}
