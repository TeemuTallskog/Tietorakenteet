package jono;

public class Node {
    public String value;
    public Node right;
    Node next;

    public Node (String data){
        value = data;
        this.next = null;
    }
}
