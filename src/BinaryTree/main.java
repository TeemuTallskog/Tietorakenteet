package BinaryTree;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args){

        Binarytree tree = new Binarytree();
        /*
        tree.createRandomTree(tree.getRoot(),100, 0.7f, 0, 5);
        BinaryTreePrinter.print(tree.getRoot());
        System.out.println("Pre order: " + tree.printPreOrder(tree.getRoot()));
        System.out.println("In order: " + tree.printInOrder(tree.getRoot()));
        System.out.println("Post order: " + tree.printPostOrder(tree.getRoot()));

        Integer[] list = new Integer[7];
        for(int i = 0; i < 7; i++){
            list[i] = i;
        }
        List<Integer> integerList = Arrays.asList(list);

        Collections.shuffle(integerList);

        integerList.toArray(list);

        int[] list = {20,4,2,1,13,44,9,10,22,21,30,60};
        tree.createTree(list);
        BinaryTreePrinter.print(tree.getRoot());
        System.out.println("Deleting 13");
        tree.deleteRoot(13);
        BinaryTreePrinter.print(tree.getRoot());
        System.out.println("Deleting 22");
        tree.deleteRoot(22);
        BinaryTreePrinter.print(tree.getRoot());
        System.out.println("Deleting 1");
        tree.deleteRoot(1);
        BinaryTreePrinter.print(tree.getRoot());

         */

        /*
        int[] list = {20,4,2,1,13,44,9,10,22,21,30, 27, 37,60};
        tree.createTree(list);
        BinaryTreePrinter.print(tree.getRoot());
        tree.subTreeDepth(20);
        tree.subTreeDepth(44);
        tree.subTreeDepth(13);
        tree.subTreeDepth(30);
        tree.subTreeDepth(21);
        System.out.println("Adding 40");
        tree.append(40);
        BinaryTreePrinter.print(tree.getRoot());
        tree.subTreeDepth(20);
        tree.subTreeDepth(44);
        tree.subTreeDepth(13);
        tree.subTreeDepth(30);
        tree.subTreeDepth(21);

         */


        /*
        int[] list = {20,4,2,1,13,44,9,10,22,21,30, 27, 37,60};
        tree.createTree(list);
        BinaryTreePrinter.print(tree.getRoot());
        tree.search(1);
        tree.search(60);
        tree.search(22);
        tree.search(4);
        tree.search(19);
        tree.search(42);
        System.out.println(tree.printInOrder(tree.getRoot()));

         */


        /*
        Integer[] num = {20,4,2,1,13,44,9,10,22,21,30, 27, 37,60};
        List<Integer> list = Arrays.asList(num);
        JCAPTreeSet treeSet = new JCAPTreeSet(list);
        System.out.println(treeSet.inOrder());
        System.out.println("Adding 42.");
        treeSet.add(42);
        System.out.println(treeSet.inOrder());
        System.out.println("Does tree set contain 20: " + treeSet.contains(20));
        System.out.println("Does tree set contain 99: " + treeSet.contains(99));

         */

        int[] num = new int[100000];
        for(int i = 0; i < 100000; i++){
            int n = (int) (Math.random() * 1000000);
            num[i] = n;
        }

        List<Integer> list = IntStream.of(num).boxed().collect(Collectors.toList());

        JCAPTreeSet jcapTreeSet = new JCAPTreeSet(list);
        Binarytree binarytree = new Binarytree();
        binarytree.createTree(num);

        long jcapStart = System.currentTimeMillis();
        System.out.println(jcapTreeSet.inOrder());
        long jcapEnd = System.currentTimeMillis() - jcapStart;
        System.out.println("----------------------------------------------");
        long binaryTreeStart = System.currentTimeMillis();
        System.out.println(binarytree.printInOrder(binarytree.getRoot()));
        long binaryTreeEnd = System.currentTimeMillis() - binaryTreeStart;
        System.out.println("BinaryTree time = " + binaryTreeEnd);
        System.out.println("JCAP TreeSet time = " + jcapEnd);

    }
}
