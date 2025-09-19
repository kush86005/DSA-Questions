package LinkedList;
import java.util.*;

public class Question01 {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Insert method fixed: now correctly links the new node
    public static void insertion(String data) {
        Node val = new Node(data);

        if (head == null) {
            head = val;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = val;  // Fix here: link new node to the last node
        }
    }

    // Print method improved for better output
    public static void printlist() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node val = head;
        while (val != null) {
            System.out.print(val.data);
            if (val.next != null) {
                System.out.print(" -> ");
            }
            val = val.next;
        }
        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements (type 'exit' to stop):");
        while (true) {
            String data = sc.nextLine();

            if (data.equalsIgnoreCase("exit")) {
                break;
            }

            insertion(data); // Call insertion directly, no object called 'list'
        }

        System.out.print("The list is: ");
        printlist();

        sc.close();
    }
}
