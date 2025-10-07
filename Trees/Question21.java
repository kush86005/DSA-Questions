package Trees;
import java.util.*;
public class Question21 {
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
    static Node curr=null;
    public static void flaten(Node root){
        if(root==null){
            return;
        }
        flaten(root.right);
        flaten(root.left);

        root.right=curr;
        root.left=null;
        curr=root;
    }
    public static void print(Node root){
        if(root==null){
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
        flaten(root);
        print(root);
    }
}
