package BinaryTree;

import java.util.Arrays;
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

    public void createTree(int[] list){
        System.out.println(Arrays.toString(list));
        this.root = new Node(list[0]);

        for(int i = 1; i<list.length; i++){
            extendTree(root, list[i], 0);
        }
    }

    private void extendTree(Node node, int i, int depth){
        if(node.left == null && i <= node.value){
            node.setLeft(new Node(i));
            System.out.println(i + ": was set at the depth of " + (depth + 1));
        }else if(node.right == null && i >= node.value){
            node.setRight(new Node(i));
            System.out.println(i + ": was set at the depth of " + (depth + 1));
        }else if(i <= node.value){
            extendTree(node.left, i, depth + 1);
        }else{
            extendTree(node.right, i, depth + 1);
        }
    }

    public void append(int i){
        extendTree(root, i, 0);
    }

    public void findDepth(int i){
        printDepthOf(root, i, 0);
    }

    private void printDepthOf(Node node, int i, int depth){
            if(node.value == i){
                System.out.println(i + ": is at depth of " + depth);
            }else{
                if(node.left != null){
                    printDepthOf(node.left, i, depth + 1);
                }
                if(node.right != null){
                    printDepthOf(node.right, i, depth + 1);
                }
            }
    }

    public void subTreeDepth(int i){
        Node subRoot = findNode(root, i);
        if(subRoot != null){
            int depth = findMaxDepth(subRoot, 0);
            System.out.println("Depth of the sub tree starting from node " + i + " is " + depth);
        }else{
            System.out.println("Value doesn't exist in the tree");
        }
    }

    private Node findNode(Node node, int i){
        if(node.value == i){
            return node;
        }else{
            Node left = null;
            Node right = null;
            if(node.left != null){
                left = findNode(node.left, i);
            }
            if(node.right != null){
                right = findNode(node.right, i);
            }
            if(left != null) return left;
            if(right != null) return right;
            else return null;
        }
    }

    private int findMaxDepth(Node node, int depth){
        int left = depth;
        int right = depth;
        if(node.left != null){
            left = findMaxDepth(node.left, depth + 1);
        }
        if(node.right != null){
            right = findMaxDepth(node.right, depth + 1);
        }
        if(left > right)return left;
        else return right;
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

    public void contains(int i){
        if(containsCheck(root, i)) System.out.println("Tree contains " + i);
        else System.out.println("Tree doesn't contain " + i);
    }

    private boolean containsCheck(Node root, int i){
        if(root.value == i){
            return true;
        }else{
            if(root.left != null){
                if(containsCheck(root.left, i)) return true;
            }
            if(root.right != null){
                if(containsCheck(root.right, i)) return true;
            }
            return false;
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

    public void deleteRoot(int i){
        findAndDelete(root, i);
    }

    private void findAndDelete(Node node, int i){
            if(node.left != null){
                if(node.left.value == i) node.left = null;
                else findAndDelete(node.left, i);
            }
            if(node.right != null){
                if(node.right.value == i) node.right = null;
                else findAndDelete(node.right, i);
            }

    }
}
