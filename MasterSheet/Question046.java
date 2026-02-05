package MasterSheet;
import java.util.*;
public class Question046 {
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

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static boolean isSameTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null || root1.data != root2.data) return false;

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes for Tree 1: ");
        int n1 = sc.nextInt();
        Node root1 = null;
        if (n1 > 0) System.out.print("Enter elements for Tree 1: ");
        for (int i = 0; i < n1; i++) {
            root1 = insert(root1, sc.nextInt());
        }

        System.out.print("Enter number of nodes for Tree 2: ");
        int n2 = sc.nextInt();
        Node root2 = null;
        if (n2 > 0) System.out.print("Enter elements for Tree 2: ");
        for (int i = 0; i < n2; i++) {
            root2 = insert(root2, sc.nextInt());
        }

        if (isSameTree(root1, root2)) {
            System.out.println("Result: Both trees are identical.");
        } else {
            System.out.println("Result: Trees are different.");
        }
    }
}