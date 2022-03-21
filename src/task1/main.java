package task1;

public class main {
    public static void main(String[] args){
        SinglyLinkedList jono = new SinglyLinkedList();

        System.out.println("Adding 'Tänään'");
        jono.add("Tänään");
        jono.display();
        System.out.println("Adding 'on'");
        jono.add("on");
        jono.display();
        System.out.println("Adding 'Keskiviikko'");
        jono.add("Keskiviikko");
        jono.display();

        System.out.println("Popping");
        jono.pop();
        jono.display();
        System.out.println("Popping");
        jono.pop();
        jono.display();
        System.out.println("Popping");
        jono.pop();
        jono.display();
        System.out.println("Popping");
        jono.pop();
        jono.display();

    }
}
