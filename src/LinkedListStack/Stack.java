package LinkedListStack;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
    private LinkedList<String> list;
    public Stack(){
        list = new LinkedList<String>();
    }

    public void push(String string){
        list.push(string);
    }

    public String pop(){
        if(list.isEmpty()) return null;
        return list.pop();
    }

    public void display(){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
    }
}
