package task1;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {

    private Node currentPOS = null;

    private Node head = null;

    private Node tail = null;

    private List<String> linkedList = new LinkedList<String>();

    public SinglyLinkedList(){

    }

    public void addToNextPOS(String value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }
        if(tail == null){
            tail = node;
        }
        currentPOS.next = node;
    }


    public void nextPOS(){
        currentPOS = currentPOS.next;
    }


}
