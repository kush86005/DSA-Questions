package MasterSheet;
import java.util.*;
public class Question015 {
    public static int profit(int[] arr){
        int n=arr.length;
        int ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                ans+=arr[i]-arr[i-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{100, 180, 260, 310, 40, 535, 695};
        int ans=profit(arr);
        System.out.print(ans);
    }
}
