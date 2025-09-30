package Recursion;
import java.util.*;
public class Question18 {
    public static boolean palindrome(String s,int start,int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return palindrome(s,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        boolean istrue=palindrome(s,0,n-1);
        System.out.print(istrue);
    }
}
