package DSASheet;
//This is the best approach but only for either lower or uppercase input.
import java.util.*;
public class Question6 {
    public static boolean Anagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;

        int[] ans=new int[26];
        for(int i=0;i<s1.length();i++){
            ans[s1.charAt(i)-'a']++;
            ans[s2.charAt(i)-'a']--;
        }
        for(int count:ans){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter string 1:- ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();

        System.out.print("Enter string 2:- ");
        String s2=sc.nextLine();

        System.out.print(Anagram(s1,s2));
    }
}
