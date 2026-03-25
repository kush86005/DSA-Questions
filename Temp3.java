import java.util.*;

public class Temp3 {
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
    static Node root=null;
    public static void insert(int data){
        root=recursion(root,data);
    }
    public static Node recursion(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=recursion(root.left,data);
        }
        if(data>root.data){
            root.right=recursion(root.right,data);
        }
        return root;
    }
    public static boolean same(Node root1,Node root2){
        if((root1==null&&root2==null)){
            return true;
        }
        if((root1==null||root2==null)){
            return false;
        }
        if(root1.data!=root2.data){
            return false;
        }
        return same(root1.left,root2.left)&&same(root1.right,root2.right);
    }
    public static void main(String[] args) {
        Node root1 = null;
        Node root2 = null;

        root1 = recursion(root1, 4);
        root1 = recursion(root1, 2);
        root1 = recursion(root1, 6);

        root2 = recursion(root2, 4);
        root2 = recursion(root2, 2);
        root2 = recursion(root2, 6);

        System.out.println(same(root1, root2));
    }
}
