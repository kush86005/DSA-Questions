package DSAFinal;
import java.util.*;
public class Question19 {
    public static boolean palindrome(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.print(palindrome(s));
    }
}
