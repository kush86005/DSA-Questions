package Trees;
import java.util.*;
public class Question05 {
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
    static int count=0;
    public static void insert(int data){
        root=recursion(root,data);
        count++;
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
    public static int sumofval(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumofval(root.left)+sumofval(root.right);
    }
    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            insert(val);
        }
        System.out.println("Size is:- "+count);
        int ans=sumofval(root);
        System.out.print("Sum is:- "+ans);
    }
}
