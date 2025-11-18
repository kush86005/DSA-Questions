package MasterSheet;
import java.util.*;
public class Question014 {
    public static int profit(int[] arr){
        int n=arr.length;
        int maxprofit=0;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<minvalue){
                minvalue=arr[i];
            }
            int val=arr[i]-minvalue;
            if(maxprofit<val){
                maxprofit=val;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{7,1,5,3,6,4};
        int ans=profit(arr);
        System.out.print(ans);
    }
}
