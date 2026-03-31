package MasterSheet;
import java.util.*;
public class Question052 {
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
    static int result=0;
    static int count=0;
    public static int ksmallest(Node root,int k){
        helper(root,k);
        return result;
    }
    public static void helper(Node root,int k){
        if(root==null){
            return;
        }
        helper(root.left,k);
        count++;
        if(count==k){
            result=root.data;
            return;
        }
        helper(root.right,k);
    }
    //Alternate way without recursion
    public static int AlternateFunction(Node root,int k) {
        Stack<Node> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) { // <-- not while(true)
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            k--;
            if (k == 0) {
                return root.data;
            }
            root = root.right;
        }
        return -1; // K is invalid
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
        System.out.print("Enter K:- ");
        int k=sc.nextInt();
        int ans=ksmallest(root,k);
        System.out.print(ans);
    }
}
