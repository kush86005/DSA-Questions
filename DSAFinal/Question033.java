package DSAFinal;
import java.util.*;
public class Question033 {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public Minstack(){
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }else{
            int current=Math.min(val,minstack.peek());
            minstack.push(current);
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
