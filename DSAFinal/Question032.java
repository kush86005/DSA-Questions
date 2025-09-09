package DSAFinal;
import java.util.*;
public class Question032 {
    public static boolean valid(String s){
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else if(ch==')'||ch==']'||ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==')'&&top!='('||ch==']'&&top!='['||ch=='}'&&top!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        boolean ans=valid(s);
        System.out.print(ans);
    }
}
