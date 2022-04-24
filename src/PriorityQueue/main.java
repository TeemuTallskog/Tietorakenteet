package PriorityQueue;

public class main {
    public static void main(String[] args){

        Queue queue = new Queue();
        queue.insert(20);
        queue.printHeap();
        queue.insert(15);
        queue.printHeap();
        queue.insert(8);
        queue.printHeap();
        queue.insert(10);
        queue.printHeap();
        queue.insert(5);
        queue.printHeap();
        queue.insert(7);
        queue.printHeap();
        queue.insert(6);
        queue.printHeap();
        queue.insert(2);
        queue.printHeap();
        queue.insert(9);
        queue.printHeap();
        queue.insert(1);
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
        System.out.println("Removed min " + queue.extractMin());
        queue.printHeap();
    }
}
