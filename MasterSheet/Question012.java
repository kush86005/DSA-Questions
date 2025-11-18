package MasterSheet;
import java.util.*;
public class Question012 {
    public static boolean palindrome(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
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
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean isTrue=palindrome(s);
        System.out.print(isTrue);
    }
}
