package Hashing;

public class main {
    public static void main(String[] args){
        HashTable hashTable = new HashTable();
        hashTable.insert(1, "Test");
        hashTable.insert(1, "One");
        hashTable.insert(2, "Two");
        hashTable.insert(7,"Test");
        hashTable.insert(7,"Seven");
        System.out.println(hashTable.retrieve(1));
        System.out.println(hashTable.retrieve(2));
        System.out.println(hashTable.retrieve(7));
        System.out.println(hashTable.retrieve(8));
    }
}
