package Stack;

public class Question02 {
    private int maxSize;  // Maximum size of the stack
    private int top;      // Top of the stack
    private int[] stack;  // Array to hold stack elements

    // Constructor to initialize the stack
    public Question02(int size) {
        maxSize = size;          // Set the maximum size of the stack
        stack = new int[maxSize]; // Create an array of integers of given size
        top = -1;                // Initially, the stack is empty
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Push operation to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push " + value + ", stack is full.");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Pop operation to remove the top element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Attempt to pop from an empty stack.");
        } else {
            int poppedValue = stack[top--];
            System.out.println(poppedValue + " popped from stack.");
        }
    }

    // Peek operation to view the top element of the stack
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Attempt to peek on an empty stack.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        Question02 stack = new Question02(5);  // Stack with a capacity of 5

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Attempt to push one more element (Should cause Stack Overflow)
        stack.push(60);

        // Peek the top element
        stack.peek();

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Try popping more elements than are present (Should cause Stack Underflow)
        stack.pop();
        stack.pop();
        stack.pop();

        // Try to peek after the stack is empty (Should cause Stack Underflow)
        stack.peek();
    }
}
