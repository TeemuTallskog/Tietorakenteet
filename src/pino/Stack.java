package pino;

public class Stack {

    private class Node {
        String value;
        Node link;
        public Node (String str){
            this.value = str;
        }
    }

    Node top;

    public Stack(){
        this.top = null;
    }

    public void push(String str){
        Node node = new Node(str);
        if(node == null){
            return;
        }
        node.link = top;
        top = node;
    }
    public void pop(){
        if(top == null){
            System.out.println("Stack is empty!");
            return;
        }
        top = top.link;
    }

    public String peek(){
        if(top != null){
            return top.value;
        }else{
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
        }else{
            Node temp = top;
            while(temp != null){
                System.out.print(temp.value + ", ");
                temp = temp.link;
            }
            System.out.print("\n");
        }
    }
}
