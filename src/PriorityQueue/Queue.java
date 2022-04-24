package PriorityQueue;

import java.util.ArrayList;

class Queue {
    public static int heapSize = 0;
    public static int treeArraySize = 20;
    public static int INF = 100000;
    private static int A[];

    public Queue(){
        this.A = new int[treeArraySize];
        buildMinHeap(A);
    }

    //function to get right child of a node of a tree
    public static int getRightChild(int index) {
        if((((2*index)+1) < A.length && (index >= 1)))
            return (2*index)+1;
        return -1;
    }

    //function to get left child of a node of a tree
    public static int getLeftChild(int index) {
        if(((2*index) < A.length && (index >= 1)))
            return 2*index;
        return -1;
    }

    //function to get the parent of a node of a tree
    public static int getParent(int index) {
        if ((index > 1) && (index < A.length)) {
            return index/2;
        }
        return -1;
    }

    public static void minHeapify(int index) {
        int leftChildIndex = getLeftChild(index);
        int rightChildIndex = getRightChild(index);

        // finding smallest among index, left child and right child
        int smallest = index;

        if ((leftChildIndex <= heapSize) && (leftChildIndex>0)) {
            if (A[leftChildIndex] < A[smallest]) {
                smallest = leftChildIndex;
            }
        }

        if ((rightChildIndex <= heapSize && (rightChildIndex>0))) {
            if (A[rightChildIndex] < A[smallest]) {
                smallest = rightChildIndex;
            }
        }

        // smallest is not the node, node is not a heap
        if (smallest != index) {
            int temp;
            //swapping
            temp = A[smallest];
            A[smallest] = A[index];
            A[index] = temp;
            minHeapify(smallest);
        }
    }

    public static void buildMinHeap(int A[]) {
        for(int i=heapSize/2; i>=1; i--) {
            minHeapify(i);
        }
    }

    public static int minimum() {
        return A[1];
    }

    public int extractMin() {
        int minm = A[1];
        A[1] = A[heapSize];
        heapSize--;
        minHeapify(1);
        return minm;
    }

    public static void decreaseKey(int index, int key) {
        A[index] = key;
        while((index>1) && (A[getParent(index)] > A[index])) {
            int temp;
            temp = A[getParent(index)];
            A[getParent(index)] = A[index];
            A[index] = temp;
            index = getParent(index);
        }
    }

    public static void increaseKey(int index, int key) {
        A[index] = key;
        minHeapify(index);
    }

    public void insert(int key) {
        heapSize++;
        A[heapSize] = INF;
        decreaseKey(heapSize, key);
    }

    public void printHeap() {
        for(int i=1; i<=heapSize; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println("");
    }

}
