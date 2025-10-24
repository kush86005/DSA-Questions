package Stack;
import java.util.*;
public class Question08 {
    public static int minSwaps(String s) {
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                open++;
            }else{
                if(open<=0){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return (close+1)/2;
    }

    public static void main(String[] args) {
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=minSwaps(s);
        System.out.print(ans);
    }
}
