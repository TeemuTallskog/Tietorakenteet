package Suunnittelumallit.Strategy;

import java.util.Arrays;

public class MessyList {

    private Sorter sorter;
    private int[] messyList;

    public MessyList(Sorter sorter, int[] messyList){
        this.messyList = messyList;
        this.sorter = sorter;
    }

    public void changeList(int[] messyList){
        this.messyList = messyList;
    }

    public void sortMess(){
        long start = System.currentTimeMillis();
        messyList = sorter.sort(messyList);
        long timeElapsed = System.currentTimeMillis() - start;
        System.out.println("Sorting took " + timeElapsed + "ms, with " + sorter.getName());
    }

    public void printList(){
        System.out.println(Arrays.toString(messyList));
    }

    public void setStrategy(Sorter sorter){
        this.sorter = sorter;
    }
}
