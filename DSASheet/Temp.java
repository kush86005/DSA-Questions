package DSASheet;
import java.util.*;
public class Temp {
   public static int stock(int[] arr){
       int n=arr.length;
       for(int i=0;i<n-1;i++){
           if(arr[i]<arr[i+1]){
               count+=arr[i+1]-arr[i];
           }
       }
       return count;
   }
}
