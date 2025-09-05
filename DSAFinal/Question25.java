package DSAFinal;
import java.util.*;
public class Question25 {
    public static String reverse(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String sb=reverse(s);
        System.out.print(sb);
    }
}
