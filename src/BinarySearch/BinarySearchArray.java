package BinarySearch;

import java.util.Arrays;

public class BinarySearchArray {
    private int[] list;

    public BinarySearchArray(int[] list){
        this.list = list;
        Arrays.sort(this.list);
        System.out.println("Array sorted and stored.");
        System.out.println(Arrays.toString(this.list));
    }

    public int search(int i){
        return binarySearch(i, 0, list.length - 1);
    }

    private int binarySearch(int i, int min, int max){
        if(max >= min){
            int mid = Math.round((min + max)/2);
            if(list[mid] == i) return mid;

            if(list[mid] > i) return binarySearch(i, min, mid - 1);

            return binarySearch(i, mid + 1 ,max);
        }
        return -1;
    }
}