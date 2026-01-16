package MasterSheet;
import java.util.*;
public class Question021 {
    public static int reverse(String[] token){
        Stack<Integer> stack=new Stack<>();
        for(String count:token){
            if(count.equals("+")||count.equals("-")||count.equals("*")||count.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                int result=0;
                switch(count){
                    case"+":
                    result=a+b;
                    break;
                    case"-":
                    result=a-b;
                    break;
                    case"*":
                    result=a*b;
                    break;
                    case"/":
                    result=a/b;
                    break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(count));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String[] token=new String[]{"2","1","+","3","*"};
        int ans=reverse(token);
        System.out.print(ans);
    }
}
