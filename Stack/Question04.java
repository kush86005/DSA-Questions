package Stack;
import java.util.*;
public class Question04 {
    public static int countMinReversals(String s) {
        if(s.length()%2!=0){
            return -1;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }else if(stack.peek()=='{'&&ch=='}'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        int ans=0;
        if(stack.isEmpty()){
            return 0;
        }
        int open=0;
        int close=0;
        while(!stack.isEmpty()){
            if(stack.pop()=='{')open++;
            else close++;
        }
        return (open+1)/2+(close+1)/2;
    }

    public static void main(String[] args) {
        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=countMinReversals(s);
        System.out.print(ans);
    }
}
