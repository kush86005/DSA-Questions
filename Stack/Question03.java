package Stack;

public class Question03 {
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node top;

    public Question03() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack.");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop from empty stack.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot peek on empty stack.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    public static void main(String[] args) {
        Question03 stack = new Question03();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}
