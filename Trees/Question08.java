package Trees;
import java.util.*;
public class Question08 {
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
    public static void levelprint(Node root,int n){
        if(root==null) {
            System.out.print("The tree is empty");
            return;
        }
        if(n==1){
            System.out.print(root.data+" ");
            return;
        }else {
            levelprint(root.left, n - 1);
            levelprint(root.right, n - 1);
        }
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
        System.out.print("Enter level to print:- ");
        int size=sc.nextInt();
        levelprint(root,size);
    }
}
