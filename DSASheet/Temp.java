package DSASheet;
import java.util.*;
public class Temp {
   public static int sorted(int[] arr,int target){
      HashMap<Integer,Integer> digit=new HashMap<>();
      int count=0;
      int n=arr.length;
      for(int i=0;i<n;i++){
         int tar=target-arr[i];

         if(digit.containsKey(tar)){
            count+=digit.get(tar);
         }
         digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);
      }
      return count;
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
      System.out.print("Enter target:- ");
      int target=sc.nextInt();

      int ans=sorted(arr,target);
      System.out.print(ans);
   }
}
