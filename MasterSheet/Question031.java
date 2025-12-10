package MasterSheet;
import java.util.*;
public class Question031 {
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        if(n==0){
            return ans;
        }
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                int left = mid;
                while (left - 1 >= 0 && nums[left - 1] == target) {
                    left--;
                }
                int right = mid;
                while (right + 1 < n && nums[right + 1] == target) {
                    right++;
                }

                ans[0] = left;
                ans[1] = right;
                return ans;
            }
            if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,7,8,8,10};
        int target=8;
        int ans[]=searchRange(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
