package pino;

public class Main {
    public static void main(String[] args){
        Stack pino = new Stack();
        System.out.println("Adding 'Tänään'");
        pino.push("Tänään");
        pino.display();

        System.out.println("Adding 'on'");
        pino.push("on");
        pino.display();

        System.out.println("Adding 'Maanantai'");
        pino.push("Maanantai");
        pino.display();

        System.out.println("Popping...");
        pino.pop();
        pino.display();

        System.out.println("Popping...");
        pino.pop();
        pino.display();

        System.out.println("Popping...");
        pino.pop();
        pino.display();

        System.out.println("Popping...");
        pino.pop();
        pino.display();

    }

}
