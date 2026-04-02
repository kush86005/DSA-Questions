package MasterSheet;
import java.util.*;

public class Question055 {

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
        } else if (data > root.data) {
            root.right = recursion(root.right, data);
        }

        return root;
    }

    // SERIALIZE
    public String serialize(Node root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp == null) {
                sb.append("null,");
                continue;
            }

            sb.append(temp.data).append(",");
            queue.offer(temp.left);
            queue.offer(temp.right);
        }

        return sb.toString();
    }

    // DESERIALIZE
    public Node deserialize(String data) {
        if (data == null || data.length() == 0) return null;

        String[] values = data.split(",");
        Node root = new Node(Integer.parseInt(values[0]));

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            Node parent = queue.poll();

            // Left
            if (i < values.length && !values[i].equals("null")) {
                Node left = new Node(Integer.parseInt(values[i]));
                parent.left = left;
                queue.offer(left);
            }
            i++;

            // Right
            if (i < values.length && !values[i].equals("null")) {
                Node right = new Node(Integer.parseInt(values[i]));
                parent.right = right;
                queue.offer(right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Question055 obj = new Question055();

        insert(5);
        insert(3);
        insert(7);
        insert(2);
        insert(4);

        String data = obj.serialize(root);
        System.out.println("Serialized: " + data);

        Node newRoot = obj.deserialize(data);
        System.out.println("Deserialized root: " + newRoot.data);
    }
}