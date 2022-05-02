package Suunnittelumallit.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorTesting {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> testList = new LinkedList<>();

        for(int i = 0; i < 200; i++){
            testList.push("TestItem number: " + i);
        }

        Iterator<String> iterator = testList.iterator();

        System.out.println("Test A:");
        TestRunner runnerA = new TestRunner(testList.iterator(), "RunnerA",0);
        TestRunner runnerB = new TestRunner(testList.iterator(), "RunnerB",0);
        runnerA.start();
        runnerB.start();

        runnerA.join();
        runnerB.join();
        System.out.println("Test B:");
        TestRunner runner1 = new TestRunner(iterator, "Runner1",0);
        TestRunner runner2 = new TestRunner(iterator, "Runner2",0);
        runner1.start();
        runner2.start();

        runner1.join();
        runner2.join();
        System.out.println("Test C:");
        LinkedList<String> alterList = new LinkedList<>(testList);

        TestRunner runnerAlpha = new TestRunner(alterList.iterator(), "Alpha", 1, alterList);
        TestRunner runnerBeta = new TestRunner(alterList.iterator(), "Beta", 1, alterList);

        runnerAlpha.start();
        runnerBeta.start();

        runnerAlpha.join();
        runnerBeta.join();
        System.out.println("Test D:");
        LinkedList<String> alterList2 = new LinkedList<>(testList);

        TestRunner ThreadAlpha = new TestRunner(alterList2.iterator(), "Alpha thread", 2, alterList2);
        TestRunner ThreadBeta = new TestRunner(alterList2.iterator(), "Beta thread", 2, alterList2);

        ThreadAlpha.start();
        ThreadBeta.start();

    }


    private static class TestRunner extends Thread{
        Iterator<String> iterator;
        String name;
        int mode;
        LinkedList<String> list;
        public TestRunner(Iterator<String> iterator, String name, int mode){
            this.iterator = iterator;
            this.name = name;
            this.mode = mode;
        }
        public TestRunner(Iterator<String> iterator, String name, int mode, LinkedList<String> list){
            this.iterator = iterator;
            this.name = name;
            this.mode = mode;
            this.list = list;
        }


        @Override
        public void run(){
            switch (mode){
                case 0:
                    while(iterator.hasNext()) System.out.println(iterator.next() + " " + name);
                    break;
                case 2:
                    boolean toggle = false;
                    while(iterator.hasNext()){
                            System.out.println(iterator.next() + " " + name);
                            if(toggle) iterator.remove();
                            toggle = !toggle;
                    }
                    break;
                case 1:
                    int[] nums = new int[200];
                    boolean toggle2 = false;
                    while(iterator.hasNext()){
                        System.out.println(iterator.next() + " " + name);
                        if(toggle2){
                            int i = (int)(Math.random() * 200);
                            if(nums[i] != i){
                                System.out.println(list.remove(i) + " removed by " + name);
                            }
                            nums[i] = i;
                        }
                        toggle2 = !toggle2;
                    }
                    break;
            }
        }

    }
}
