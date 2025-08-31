package DSAFinal;
import java.util.*;
public class Question6 {
    public static boolean Anagram(String s,String t){
        int n=s.length();
        HashMap<Character,Integer> digit=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            digit.put(c,digit.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            if(!digit.containsKey(c)||digit.get(c)==0){
                return false;
            }else{
                digit.put(c,digit.get(c)-1);
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter String 1:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.print("Enter String 2:- ");
        String t=sc.nextLine();

        System.out.print(Anagram(s,t));
    }
}
