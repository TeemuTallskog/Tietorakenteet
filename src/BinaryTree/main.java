package BinaryTree;

public class main {
    public static void main(String[] args){
        Binarytree tree = new Binarytree();
        tree.createRandomTree(tree.getRoot(),100, 0.7f, 0, 5);
        BinaryTreePrinter.print(tree.getRoot());
        System.out.println("Pre order: " + tree.printPreOrder(tree.getRoot()));
        System.out.println("In order: " + tree.printInOrder(tree.getRoot()));
        System.out.println("Post order: " + tree.printPostOrder(tree.getRoot()));
    }
}
