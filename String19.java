import java.util.*;

public class String19 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Stack<Character> brackets=new Stack<>();

        int swaps=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(i==str.length()-1){
                if(ch=='['){
                    swaps++;
                }
            }
            if(ch=='['){
                brackets.push(ch);
            }else if(ch==']'){
                if(brackets.isEmpty()){
                    swaps++;
                }else{
                    char cha=brackets.peek();
                    if(cha=='['){
                        brackets.pop();
                    }
                }
            }
        }
        System.out.print(swaps);
    }
}
