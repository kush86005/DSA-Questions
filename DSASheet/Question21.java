package DSASheet;
import java.util.*;
public class Question21 {
    public static boolean palindrome(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
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
