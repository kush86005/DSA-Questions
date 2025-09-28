package Stack;

public class Question03 {
    // Node class for Linked List
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor to initialize empty stack
    public Question02() {
        top = null;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // Point new node to current top
        top = newNode;      // Move top to new node
        System.out.println(value + " pushed to stack.");
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop from empty stack.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next; // Move top to the next node
        }
    }

    // Peek operation
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot peek on empty stack.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Main method to test stack
    public static void main(String[] args) {
        Question02 stack = new Question02();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek
        stack.peek();

        // Pop elements
        stack.pop();
        stack.pop();
        stack.pop();

        // Try popping again (underflow)
        stack.pop();

        // Try peeking (underflow)
        stack.peek();
    }
}
