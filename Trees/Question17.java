package Trees;
import java.util.*;
public class Question17 {
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
    public static void helper(Node root,int sum,List<Integer> list,List<List<Integer>> ans){
        if(root==null){
            return;
        }
        list.add(root.data);
        if(root.left==null&&root.right==null&&root.data==sum){
            ans.add(new ArrayList<>(list));
        }else{
            helper(root.left,sum-root.data,list,ans);
            helper(root.right,sum-root.data,list,ans);
        }
        list.remove(list.size()-1);
    }
    public static List<List<Integer>> pathsum(Node root,int targetsum){
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,targetsum,list,ans);
        return ans;
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
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        List<List<Integer>> ans=pathsum(root,target);
        System.out.print(ans);
    }
}
