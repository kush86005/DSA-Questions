package DSASheet;
import java.util.*;
public class Temp {
   public static boolean Anagram(String s,String t) {
      int n=s.length();
      int q=t.length();
      if(n!=q) return false;
      HashMap<Character,Integer> digit=new HashMap<>();
      for(int i=0;i<n;i++){
         char c=s.charAt(i);
         digit.put(c,digit.getOrDefault(c,0)+1);
      }
      HashMap<Character,Integer> answer=new HashMap<>();
      for(int i=0;i<n;i++){
         char c=t.charAt(i);
         answer.put(c,answer.getOrDefault(c,0)+1);
      }
      if(digit.equals(answer)){
         return true;
      }else {
         return false;
      }
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
