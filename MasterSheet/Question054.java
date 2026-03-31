package MasterSheet;
import java.util.*;

public class Question054 {

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

    static Node root = null;

    public static void insert(int data) {
        root = recursion(root, data);
    }

    public static Node recursion(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = recursion(root.left, data);
        }
        if (data > root.data) {
            root.right = recursion(root.right, data);
        }
        return root;
    }

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }

    public static int helper(Node root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        int currentPath = root.data + left + right;

        maxSum = Math.max(maxSum, currentPath);

        return root.data + Math.max(left, right);
    }

    public static void main(String[] args) {
        insert(10);
        insert(5);
        insert(15);
        insert(3);
        insert(7);

        System.out.println("Max Path Sum: " + maxPathSum(root));
    }
}