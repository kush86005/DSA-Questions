package MasterSheet;
import java.util.*;

public class Question053 {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root = null;

    public static void insert(int data){
        root = recursion(root, data);
    }

    public static Node recursion(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = recursion(root.left, data);
        }
        if(data > root.data){
            root.right = recursion(root.right, data);
        }
        return root;
    }

    static int preindex = 0;

    public static Node buildtree(int[] preorder, int[] inorder){
        preindex = 0;
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public static Node build(int[] preorder, int[] inorder, int start, int end){
        if(start > end) return null;

        Node root = new Node(preorder[preindex++]);
        int begin = start;
        while(inorder[begin] != root.data) begin++;

        root.left = build(preorder, inorder, start, begin - 1);
        root.right = build(preorder, inorder, begin + 1, end);

        return root;
    }

    public static void printInorder(Node root) {
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void printPreorder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {10, 5, 1, 7, 40, 50};
        int[] inorder  = {1, 5, 7, 10, 40, 50};

        Node builtRoot = buildtree(preorder, inorder);

        System.out.println("Inorder of constructed tree:");
        printInorder(builtRoot);

        System.out.println("\nPreorder of constructed tree:");
        printPreorder(builtRoot);
    }
}