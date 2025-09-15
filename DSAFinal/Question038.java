package DSAFinal;
import java.util.*;
public class Question038 {
    public static int rpn(String[] token){
        Stack<Integer> stack=new Stack<>();
        for(String count:token){
            if(count.equals("+")||count.equals("-")||count.equals("*")||count.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] tokens = new String[n];

        System.out.println("Enter tokens one per line:");
        for(int i = 0; i < n; i++){
            tokens[i] = sc.nextLine();
        }

        int result = rpn(tokens);
        System.out.println("Result: " + result);
    }
}
