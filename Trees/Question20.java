package Trees;
import java.util.*;
public class Question20 {
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
        Node node=new Node(data);
        if(root==null){
            root=node;
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            if(current.left==null){
                current.left=node;
                return;
            }else{
                queue.add(current.left);
            }
            if(current.right==null){
                current.right=node;
                return;
            }else{
                queue.add(current.right);
            }
        }
    }
    public static void flatten(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current=stack.pop();
            if(current.right!=null){
                stack.add(current.right);
            }
            if(current.left!=null){
                stack.add(current.left);
            }
            if(!stack.isEmpty()) {
                current.right = stack.peek();
            }else{
                current.right=null;
            }
            current.left=null;
        }
    }
    public static void print(Node root){
        if(root==null){
            System.out.print("The tree is empty");
            return;
        }
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
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
        flatten(root);
        print(root);
    }
}
