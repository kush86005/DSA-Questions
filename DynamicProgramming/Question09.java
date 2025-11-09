package DynamicProgramming;
import java.util.*;
public class Question09 {
    public static int houserobber2(int[] nums){
        int n=nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        //Case 1:- We exclude last house
        int[] arr1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] dp1 = new int[arr1.length + 1];
        Arrays.fill(dp1, -1);
        int case1 = helper(arr1, dp1, arr1.length);

        //Case 2:- We exclude first house
        int[] arr2 = Arrays.copyOfRange(nums, 1, n);
        int[] dp2 = new int[arr2.length + 1];
        Arrays.fill(dp2, -1);
        int case2 = helper(arr2, dp2, arr2.length);

        return Math.max(case1,case2);
    }
    public static int helper(int[] nums,int[] dp,int index){
        if(index==1){
            dp[index]=nums[index-1];
            return dp[index];
        }
        if(index==0){
            dp[index]=0;
            return dp[index];
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index-1]+helper(nums,dp,index-2);
        int nopick=0+helper(nums,dp,index-1);
        dp[index]=Math.max(pick,nopick);
        return dp[index];
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=houserobber2(nums);
        System.out.print(ans);
    }
}
