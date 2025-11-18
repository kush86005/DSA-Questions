package MasterSheet;
import java.util.*;
public class Question022 {
    public static boolean valid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                stack.push(ch);
            }else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[' ||
                    ch == '}' && !stack.isEmpty() && stack.peek() == '{' ||
                    ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.print(valid(s));
    }
}
