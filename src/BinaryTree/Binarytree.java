package BinaryTree;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Binarytree {

    private Node root;
    private int value;

    public Binarytree(){
        root = new Node(0);
        value=1;
    }

    public Node getRoot(){
        return root;
    }

    public void createRandomTree(Node root,int chance, float multiplier, int depth, int maxDepth){
        if(depth < maxDepth) {
            boolean randomLeft = chance > (int) ((Math.random() * (100)));
            boolean randomRight = chance > (int) ((Math.random() * (100)));
            int temp = (int) (chance * multiplier);
            int tempdepth = depth + 1;
            if (randomLeft) {
                Node newLeft = new Node(value);
                value++;
                root.left = newLeft;
                createRandomTree(newLeft, temp, multiplier, tempdepth, maxDepth);
            }
            if (randomRight) {
                Node newRight = new Node(value);
                value++;
                root.right = newRight;
                createRandomTree(newRight, temp, multiplier, tempdepth, maxDepth);
            }
        }
    }

    public String printInOrder(Node root){
        String str = "";
        if(root.left != null){
            str += printInOrder(root.left);
        }
        str += root.value + ", ";
        if(root.right != null){
            str += printInOrder(root.right);
        }
        return str;
    }

    public String printPreOrder(Node root){
        String str = "";
        str += root.value + ", ";
        if(root.left != null){
            str += printPreOrder(root.left);
        }
        if(root.right != null){
            str += printPreOrder(root.right);
        }
        return str;
    }

    public String printPostOrder(Node root){
        String str = "";
        if(root.left != null){
            str += printPostOrder(root.left);
        }
        if(root.right != null){
            str += printPostOrder(root.right);
        }
        str += root.value + ", ";
        return str;
    }
}
