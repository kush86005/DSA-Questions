package Trees;
import java.util.*;
public class Question06 {
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
    public static int Max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int a=root.data;
        int b=Max(root.left);
        int c=Max(root.right);
        int max=Math.max(a,Math.max(b,c));
        return max;
    }
    public static int height(Node root){
        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
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
        int ans=Max(root);
        System.out.println("Maximum element:- "+ans);
        int length=height(root);
        System.out.print("Height of tree:- "+length);
    }
 }
