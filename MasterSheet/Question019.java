package MasterSheet;
import java.util.*;
public class Question019 {
    public static boolean valid(String s){
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                stack.push(ch);
            }else if(ch==']'&&stack.peek()=='['&&!stack.isEmpty()
                    ||ch=='}'&&stack.peek()=='{'&&!stack.isEmpty()
                    ||ch==')'&&stack.peek()=='('&&!stack.isEmpty()){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="[()()]{}";
        System.out.print(valid(s));
    }
}
