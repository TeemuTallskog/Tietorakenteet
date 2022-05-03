package BinaryTree;

import java.util.List;
import java.util.TreeSet;

public class JCAPTreeSet {
    TreeSet<Integer> treeSet;

    public JCAPTreeSet(List<Integer> list){
        this.treeSet = new TreeSet<Integer>(list);
    }

    public String inOrder(){
        return treeSet.toString();
    }

    public void add(Integer i){
        treeSet.add(i);
    }

    public boolean contains(Integer i){
        return treeSet.contains(i);
    }
}
