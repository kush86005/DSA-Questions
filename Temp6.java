import java.util.*;

public class Temp6 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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
    public static List<List<Integer>> LevelOrderTraversal(Node root){
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)return ans;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new LinkedList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                Node node=queue.poll();
                list.add(node.data);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
        insert(5);
        insert(3);
        insert(7);
        insert(2);
        insert(4);

        List<List<Integer>> result = LevelOrderTraversal(root);
        System.out.println(result);
    }
}