package Trees;
import java.util.*;
public class Question02 {
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
    public static void insert(int data)
    {
        root=recursion(root,data);
    }
    private static Node recursion(Node root,int data){
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
    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" -> ");
        if(root.left!=null){
            System.out.print(root.left.data+" ");
        }
        if(root.right!=null){
            System.out.print(root.right.data+" ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        display(root);
    }
}
