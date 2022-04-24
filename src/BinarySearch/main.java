package BinarySearch;

public class main {
    public static void main(String[] args){
        int[] list = {1,5,8,22,34,102,202,42,60,15};
        BinarySearchArray sortedArray = new BinarySearchArray(list);
        System.out.println("1. can be found on index: " + sortedArray.search(1));
        System.out.println("202. can be found on index: " + sortedArray.search(202));
        System.out.println("42. can be found on index: " + sortedArray.search(42));
        System.out.println("16. doesn't exist index should be -1: " + sortedArray.search(16));
        System.out.println("132. doesn't exist index should be -1: " + sortedArray.search(132));
    }
}
