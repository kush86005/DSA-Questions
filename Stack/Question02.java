package Stack;
import java.util.*;
public class Question02 {
    public static class Stack {
        int[] stack;
        int top;
        int size;

        Stack(int size) {
            this.stack = new int[size];
            this.top = -1;
            this.size = size;
        }
        // Insertion in stack
        void push(int element) {
            if (top >= size - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            stack[top] = element;
        }
        // Check if the stack is empty
        boolean isEmpty() {
            return top == -1;
        }
        // Return size of stack
        int getSize() {
            return top + 1;
        }
        // Return element at top of stack
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            return stack[top];
        }
        // Remove the element at the top
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            return stack[top--];
        }
        // Print stack
        void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack custom = new Stack(3);

        custom.push(10);
        custom.push(20);
        custom.push(30);
        custom.printStack();

        System.out.println("Popped: " + custom.pop());
        System.out.println("Top element: " + custom.peek());
        System.out.println("Stack size: " + custom.getSize());
    }
}
