package DSASheet;
import java.util.*;
public class Question20 {
    public static boolean isPalindrome(String s){
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
            if(sb.charAt(i)==sb.charAt(j)){
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

        System.out.print(isPalindrome(s));
    }
}
