package DynamicProgramming;
import java.util.*;
public class Question06 {
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter values:- ");
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int ans=minCostClimbingStairs(cost);
        System.out.print(ans);
    }
}
