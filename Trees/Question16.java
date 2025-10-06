package Trees;
import java.util.*;
public class Question16 {
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
    public static boolean target(Node root,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return root.data==sum;
        }
        return target(root.left,sum-root.data)||target(root.right,sum-root.data);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of root:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        System.out.print("Enter target sum:- ");
        int sum=sc.nextInt();
        boolean isTrue=target(root,sum);
        System.out.print(isTrue);
    }
}
