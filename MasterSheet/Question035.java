package MasterSheet;

public class Question035 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node val = new Node(data);
        if (head == null) {
            head = val;
            tail = val;
        } else {
            tail.next = val;
            tail = val;
        }
    }

    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head1 != null) curr.next = head1;
        else curr.next = head2;

        return dummy.next;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Question035 list1 = new Question035();
        Question035 list2 = new Question035();

        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        Node mergedHead = merge(list1.head, list2.head);
        print(mergedHead);
    }
}
