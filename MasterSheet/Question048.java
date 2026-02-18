package MasterSheet;
import java.util.*;
public class Question048 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static Node lowest(Node root,Node root1,Node root2){
        if(root==null){
            return root;
        }
        if(root1.data<root.data&&root2.data<root.data){
            return lowest(root.left,root1,root2);
        }
        if(root1.data>root.data&&root2.data>root.data){
            return lowest(root.right,root1,root2);
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        for (int val : values) {
            root = insert(root, val);
        }
        Node p = root.left;
        Node q = root.right;

        Node result = lowest(root, p, q);
        System.out.println("LCA of " + p.data + " and " + q.data + " is: " + result.data);
    }
}
