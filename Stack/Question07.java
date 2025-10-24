package Stack;
import java.util.*;
public class Question07 {
    public static double minswaps(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&stack.peek()=='['&&ch==']'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        double ans=(double)stack.size()/2;
        double val=Math.ceil(ans/2);
        return val;
    }

    public static void main(String[] args) {
        System.out.print("Ente string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        double ans=minswaps(s);
        System.out.print(ans);
    }
}
