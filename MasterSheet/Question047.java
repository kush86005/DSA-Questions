package MasterSheet;

public class Question047 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
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

    public static boolean subtree(Node root1, Node root2) {
        if (root1 == null) return false;

        if (sameTree(root1, root2)) return true;

        return subtree(root1.left, root2) || subtree(root1.right, root2);
    }

    private static boolean sameTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        return (root1.data == root2.data) &&
                sameTree(root1.left, root2.left) &&
                sameTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Node root1 = null;
        root1 = insert(root1, 10);
        root1 = insert(root1, 5);
        root1 = insert(root1, 15);
        root1 = insert(root1, 2);

        Node root2 = null;
        root2 = insert(root2, 5);
        root2 = insert(root2, 2);

        boolean sameTree = subtree(root1, root2);

        if (sameTree) {
            System.out.println("True!");
        } else {
            System.out.println("False");
        }
    }
}