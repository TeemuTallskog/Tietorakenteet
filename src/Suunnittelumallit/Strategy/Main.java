package Suunnittelumallit.Strategy;

public class Main {

    public static void main(String[] args){
        final int SIZE = 100000;
        int[] list = new int[SIZE];

        for(int i = 0; i < SIZE; i++){
            list[i] = (int)(Math.random() * 1000);
        }

        MessyList messyList = new MessyList(new QuickSort(), list);

        messyList.sortMess();

        messyList.changeList(list);
        messyList.setStrategy(new BubbleSort());
        messyList.sortMess();

        messyList.changeList(list);
        messyList.setStrategy(new SelectSort());
        messyList.sortMess();
    }
}
