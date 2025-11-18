package MasterSheet;
import java.util.*;
public class Question08 {
    public static int[] prefixsum(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        //prefixsum
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        //suffixsum
        int val=1;
        for(int i=n-2;i>=0;i--){
            val*=arr[i+1];
            ans[i]*=val;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        int[] ans=prefixsum(nums);
        for(int i=0;i<4;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
