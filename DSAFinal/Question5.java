package DSAFinal;
import java.util.*;
public class Question5 {
    public static boolean Anagram(String s,String t){
        int n=s.length();
        int[] alpha=new int[26];
        for(int i=0;i<n;i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for(int count:alpha){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter string 1:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.print("Enter string 2:- ");
        String t=sc.nextLine();

        System.out.print(Anagram(s,t));
    }
}
