package LinkedListStack;

public class main {

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("Tänään");
        stack.display();
        stack.push("On");
        stack.display();
        stack.push("Keskiviikko");
        stack.display();
        System.out.println("Popping... " + stack.pop());
        stack.display();
        System.out.println("Popping... " + stack.pop());
        stack.display();
        System.out.println("Popping... " + stack.pop());
        stack.display();
        System.out.println("Popping... " + stack.pop());
        stack.display();
    }
}
