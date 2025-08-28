package GoogleLeetcode;
import java.util.*;
public class Question9 {
    public static String encode(String s){
        int n=s.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            char c=s.charAt(i);
            int count=1;
            while(i+1<n&&s.charAt(i+1)==c){
                count++;
                i++;
            }
            sb.append(c);
            sb.append(count);
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String sb=encode(s);
        System.out.print(sb);
    }
}
