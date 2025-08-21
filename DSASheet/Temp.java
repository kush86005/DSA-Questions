package DSASheet;
import java.util.*;
public class Temp {
   public static boolean Anagram(String s,String t) {
      int n=s.length();
      int q=t.length();
      if(n!=q) return false;
      int[] result=new int[26];
      for(int i=0;i<n;i++){
         result[s.charAt(i)-'a']++;
         result[t.charAt(i)-'a']--;
      }
      for(int num:result){
         if(num!=0){
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
