package Stack;
import java.util.*;
public class Question06 {
    public static int minAddToMakeValid(String s) {
        int open=0;
        int insertion=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else if(ch==')'&&open>0){
                open--;
            }else{
                insertion++;
            }
        }
        return open+insertion;
    }
    public static void main(String[] args) {
        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=minAddToMakeValid(s);
        System.out.print(ans);
    }
}
