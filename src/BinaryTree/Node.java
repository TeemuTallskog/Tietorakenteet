package BinaryTree;

public class Node {
    public Node left = null;
    public Node right = null;
    Node root = null;
    int value;
    Node(int value){
        this.value = value;
    }
    void setLeft(Node left){
        this.left = left;
    }
    void setRight(Node right){
        this.right = right;
    }
    void setRoot(Node node){
        this.root = node;
    }
}
