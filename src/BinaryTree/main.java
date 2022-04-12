package BinaryTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args){
        Binarytree tree = new Binarytree();
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

        tree.createTree(list);

        BinaryTreePrinter.print(tree.getRoot());
    }
}
