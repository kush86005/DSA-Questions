package DSASheet;
import java.util.*;
public class Temp {
   public static boolean Anagram(String s,String t) {
      HashMap<Character,Integer> digit=new HashMap<>();
      int n=s.length();
      int q=t.length();
      if(n!=q) return false;
      for(int i=0;i<n;i++){
         char c=s.charAt(i);
         digit.put(c,digit.getOrDefault(c,0)+1);
      }
      for(int i=0;i<q;i++){
         char c=t.charAt(i);
         if(!digit.containsKey(c)||digit.get(c)==0){
            return false;
         }
         if(digit.containsKey(c)){
            digit.put(c,digit.get(c)-1);
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
