import java.util.*;

public class Temp1 {
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
        Node val=new Node(data);
        if(root==null){
            root=val;
        }else{
            if(data<root.data){
                root.left=recursion(root.left,data);
            }
            if(data>root.data){
                root.right=recursion(root.right,data);
            }
        }
        return root;
    }
    public static int depth(Node root){
        if(root==null){
            return 0;
        }
        int val1=depth(root.left);
        int val2=depth(root.right);
        return 1+Math.max(val1,val2);
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
        int ans=depth(root);
        System.out.print(ans);
    }
}
