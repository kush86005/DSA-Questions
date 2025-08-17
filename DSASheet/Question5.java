package DSASheet;
//This approach is for mixed alphabets(upper and lower case but slower when compared to approach for only upper or lowercase input)
//Best approach for mixed alphabets.
import java.util.*;
public class Question5 {
    public static boolean Anagram(String s,String t){
        if(s.length()!=t.length())return false;

        HashMap<Character,Integer> digit=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            digit.put(c,digit.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c=t.charAt(i);
            if(!digit.containsKey(c)||digit.get(c)==0){
                return false;
            }
            digit.put(c,digit.get(c)-1);
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter string1:- ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();

        System.out.print("Enter string2:- ");
        String s2=sc.nextLine();

        System.out.print(Anagram(s1,s2));
    }
}
