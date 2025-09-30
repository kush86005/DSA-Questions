package Recursion;
import java.util.*;
public class Question17 {
    public static String reverse(String s,int ind){
        if(ind<0){
            return new String();
        }
        return s.charAt(ind)+reverse(s,ind-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String as=reverse(s,n-1);
        System.out.print(as);
    }
}