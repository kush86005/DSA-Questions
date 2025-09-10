package DSAFinal;
import java.util.*;

public class Question035 {
    Stack<Integer> stack;
    Stack<Integer> stuck;

    public Question035() {
        stack = new Stack<>();
        stuck = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (stuck.isEmpty()) {
            transfer(); // Corrected method name
        }
        if (stuck.isEmpty()) {
            return -1;
        }
        return stuck.pop();
    }

    public int peek() {
        if (stuck.isEmpty()) {
            transfer(); // Corrected method name
        }
        if (stuck.isEmpty()) {
            return -1;
        }
        return stuck.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && stuck.isEmpty(); // Corrected syntax
    }

    private void transfer() { // Corrected method name
        while (!stack.isEmpty()) { // Corrected logic to pop from stack and push to stuck
            stuck.push(stack.pop());
        }
    }
}
