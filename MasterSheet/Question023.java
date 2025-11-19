package MasterSheet;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
public class Question023 {

    static class MinStack {
        Stack<SimpleEntry<Integer, Integer>> stack;

        public MinStack() {
            stack = new Stack<>();
        }
        public void push(int val) {
            if (stack.isEmpty()) {
                stack.push(new SimpleEntry<>(val, val));
            } else {
                int value = Math.min(val, stack.peek().getValue());
                stack.push(new SimpleEntry<>(val, value));
            }
        }
        public void pop() {
            if (stack.isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            SimpleEntry<Integer, Integer> removed = stack.pop();
            System.out.println(removed.getKey() + " is popped from the stack");
        }

        public int top() {
            if (stack.isEmpty()) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            return stack.peek().getKey();
        }
        public int getMin() {
            if (stack.isEmpty()) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            return stack.peek().getValue();
        }
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(1);

        System.out.println("Top = " + ms.top());
        System.out.println("Min = " + ms.getMin());

        ms.pop();
        System.out.println("Min after pop = " + ms.getMin());
    }
}
