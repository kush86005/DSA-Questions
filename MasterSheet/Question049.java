package MasterSheet;

import java.util.*;

public class Question049 {
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
    public static Node recursion(Node root, int data){
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
    public static Node LCA(Node root, int num1, int num2){
        if(root==null){
            return null;
        }
        if(root.data==num1||root.data==num2){
            return root;
        }
        Node left=LCA(root.left,num1,num2);
        Node right=LCA(root.right,num1,num2);

        if(left!=null&&right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }else{
            return right;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            insert(num);
        }
        System.out.print("Enter num 1:- ");
        int num1=sc.nextInt();
        System.out.print("Enter num 2:- ");
        int num2=sc.nextInt();
        Node ans=LCA(root,num1,num2);
        System.out.print(ans.data);
    }
}
