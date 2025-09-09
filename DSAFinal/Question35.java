package DSAFinal;
import java.util.*;
public class Question35 {
    Stack<Integer> stack;
    Stack<Integer> stuck;
    public Question35(){
        stack=new Stack<>();
        stuck=new stuck<>();
    }
    public void push(int x){
        stack.push(x);
    }
    public int pop(){
        if(stuck.isEmpty()){
            transfer();
        }
        if(stuck.isEmpty){
            return -1;
        }
        return stuck.pop();
    }
    public int peek(){
        if(stuck.isEmpty()){
            transfer();
        }
        if(stuck.isEmpty){
            return -1;
        }
        return stuck.peek();
    }
    public static boolean empty(){
        return stack.isEmpty&&stuck.isEmpty;
    }
    private void tranfer(){
        while(!stuck.isEmpty){
            stuck.push(stack.pop());
        }
    }
}
