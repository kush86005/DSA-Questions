package DSASheet;
import java.util.*;
public class Temp {
   public static ArrayList<Integer> Dup(int[] arr) {
      HashMap<Integer,Integer> digit=new HashMap<>();
      int n=arr.length;
      ArrayList<Integer> result=new ArrayList<>();
      for(int i=0;i<n;i++){
         digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);

         if(digit.get(arr[i])>1){
            result.add(arr[i]);
         }
      }
      return result;
   }
   public static void main(String[] args){
      System.out.print("Enter size:- ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.print("Enter elements:- ");
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      ArrayList<Integer> result=Dup(arr);
         System.out.print(result);
   }
}
