package BinaryTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    }
}
