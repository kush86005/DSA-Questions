package DynamicProgramming;
import java.util.*;
public class Question08 {
    public static int houserobber(int[] nums){
        int n=nums.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=n;i++){
            int pick=nums[i-1]+dp[i-2];
            int nopick=0+dp[i-1];
            dp[i]=Math.max(pick,nopick);
        }
        return dp[n];
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
