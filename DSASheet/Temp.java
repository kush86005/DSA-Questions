package DSASheet;
import java.util.*;
public class Temp {
   public static List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> digit=new HashMap<>();
      int n=strs.length;
      for(int i=0;i<n;i++){
         char[] ans=strs[i].toCharArray();
         Arrays.sort(ans);
         String sort=new String(ans);

         if(!digit.containsKey(sort)){
            digit.put(sort,new ArrayList<>());
         }
         digit.get(sort).add(strs[i]);
      }
      List<List<String>> result=new ArrayList<>();
      for(Map.Entry<String,List<String>> enter:digit.entrySet()){
         result.add(enter.getValue());
      }
      return result;
   }
   public static void main(String[] args){
      System.out.print("Enter string size:- ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      String[] str=new String[n];
      System.out.print("Enter strings:- ");
      for(int i=0;i<n;i++){
         str[i]=sc.nextLine();
      }
      List<List<String>> result=groupAnagrams(str);
      System.out.print(result);
   }
}
