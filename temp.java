import java util.*;

public class temp {
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
    public static Node LCA(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1||root.data==n2){
            return root;
        }
        Node left=LCA(root.left,n1,n2);
        Node right=LCA(root.right,n1,n2);
        if(left!=null&&right!=null){
            return root;
        }
        if(left==null){
            return right;
        }else{
            return left;
        }
    }
    public static List<List<Integer>> LevelOrderTraversal(Node root){
        List<List<Integer>> ans=new LinkedList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new LinkedList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                Node temp=queue.poll();
                list.add(temp.data);

                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
