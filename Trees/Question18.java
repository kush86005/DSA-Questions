package Trees;
import java.util.*;

public class Question18 {
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
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == null) {
                current.left = node;
                return;
            } else {
                queue.add(current.left);
            }
            if (current.right == null) {
                current.right = node;
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    public static int helper(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data == sum) {
            count++;
        }
        // Recursively check for paths from the left and right subtrees
        count += helper(root.left, sum - root.data);
        count += helper(root.right, sum - root.data);
        return count;
    }

    public static int pathsum(Node root, int target) {
        if (root == null) {
            return 0;
        }
        // Start by considering paths from the current node
        int count = helper(root, target);
        // Recursively check paths in the left and right subtrees
        count += pathsum(root.left, target);
        count += pathsum(root.right, target);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("No nodes to insert.");
            return;
        }

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }

        System.out.print("Enter target: ");
        int sum = sc.nextInt();

        int ans = pathsum(root, sum);
        System.out.println("Number of paths with sum " + sum + ":- " + ans);
    }
}
