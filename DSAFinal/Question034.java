package DSAFinal;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;  // This needs to be imported even after .* because its a nested static class inside class

public class Question034 {
    Stack<SimpleEntry<Integer,Integer>> stack;

    // Constructor name matches class name
    public Question034() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new SimpleEntry<>(val, val));
        } else {
            int current = Math.min(val, stack.peek().getValue());
            stack.push(new SimpleEntry<>(val, current));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().getKey();
    }

    public int getMin() {
        return stack.peek().getValue();
    }
}

