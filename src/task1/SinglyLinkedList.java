package task1;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {

    private Node currentPOS = null;

    private Node head = null;

    private Node tail = null;

    public SinglyLinkedList(){

    }

    private void headNull(Node node){
        head = node;
        tail = node;
        currentPOS = node;
    }

    public void addToTail(String value){
        Node node = new Node(value);
        if(head == null){
            headNull(node);
        }else{
            tail.next = node;
        }
        tail = node;
    }
    public void addToNextPOS(String value){
        Node node = new Node(value);
        if(head == null){
            headNull(node);
        }if(currentPOS.next == null){
            tail.next = node;
            tail = node;
            currentPOS.next = node;
        }else{
            node.next = currentPOS.next;
            currentPOS.next = node;
        }
    }
    public void addToPreviousPOS(String value){
        if(head == null){
            Node newNode = new Node(value);
            headNull(newNode);
        }
        if(currentPOS == head){
            Node newNode = new Node(value);
            newNode.next = head;
            head = currentPOS;
        }else{
            previousPOS();
            addToNextPOS(value);
        }
    }


    public void nextPOS(){
        if(currentPOS.next == null){
            currentPOS = head;
            return;
        }
        currentPOS = currentPOS.next;
    }
    public void previousPOS(){
        if(currentPOS == head){
            return;
        }
        Node current = currentPOS;
        currentPOS = head;
        while(current != currentPOS.next){
            nextPOS();
        }
    }

    public void removeCurrentNode(){
        previousPOS();
        currentPOS.next = currentPOS.next.next;
    }

    public void moveToHead(){
        currentPOS = head;
    }
    public void moveToTail(){
        currentPOS = tail;
    }

}
