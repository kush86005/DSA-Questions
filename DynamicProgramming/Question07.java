package DynamicProgramming;
import java.util.*;
public class Question07 {
    public static int helper(int[] nums,int index,int dp[]){
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
        //pick nopick problem
        int pick=nums[index-1]+helper(nums,index-2,dp);
        int nopick=0+helper(nums,index-1,dp);
        dp[index]=Math.max(pick,nopick);
        return dp[index];
    }
    public static int houserobber(int[] nums){
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,n,dp);
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=houserobber(nums);
        System.out.print(ans);
    }
}
