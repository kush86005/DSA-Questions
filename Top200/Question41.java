package Top200;
import java.util.*;
public class Question41 {
    public static boolean Palindrome(String str){
        int s=str.length();
        boolean isTrue=true;
        int i=0;
        int j=s-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                isTrue=false;
                break;
            }else{
                i++;
                j--;
            }
        }
        return isTrue;
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        boolean isTrue=Palindrome(str);
        System.out.print(isTrue);
    }
}
