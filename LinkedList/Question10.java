package LinkedList;
import java.util.*;

public class Question09 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void insert(int data) {
        Node val = new Node(data);
        if (head == null) {
            head = val;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = val;
        }
    }

    public static void findNthFromEnd(int val) {
        if (val <= 0) {
            System.out.println("Invalid index.");
            return;
        }

        Node first = head;
        Node second = head;

        // Move 'first' pointer val steps ahead
        for (int i = 0; i < val; i++) {
            if (first == null) {
                System.out.println("Index is greater than the length of the list.");
                return;
            }
            first = first.next;
        }

        // Move both pointers until 'first' reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // 'second' now points to the N-th node from the end
        System.out.println("The " + val + "th node from the end is: " + second.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }

        System.out.print("Enter index from end to find: ");
        int val = sc.nextInt();

        findNthFromEnd(val);
    }
}
