package Top200;
import java.util.*;
public class Question19 {
    public static boolean Order(int[] arr, int n){
      n= arr.length;
      boolean isTrue=true;
      int i=1;
      while(i<n&&arr[i]<arr[i-1]){
          i++;
      }
      while(i<n&&arr[i]>arr[i-1]){
          i++;
      }
      if(i!=n){
          isTrue=false;
      }
      return isTrue;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter elements:- ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean Ans=Order(arr,n);
        System.out.print(Ans);
    }
}
