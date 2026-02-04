package MasterSheet;
import java.util.*;
public class Question045 {
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
        root=recursive(root,data);
    }
    private static Node recursive(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=recursive(root.left,data);
        }else{
            root.right=recursive(root.right,data);
        }
        return root;
    }
    public static int depth(Node root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);

        return Math.max(left,right)+1;
    }
    public static void print(Node root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        if(root==null){
            System.out.print("The tree is empty");
        }else{
            int ans=depth(root);
            System.out.print("Depth of tree is:- "+ans);
        }
    }
}
