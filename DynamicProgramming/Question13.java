package DynamicProgramming;
import java.util.*;
public class Question13 {
    public static int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return helper(coins, amount, n - 1, dp);
    }
    public static int helper(int[] coins, int am, int index, int[][] dp) {
        if (am == 0) return 1;
        if (index < 0) return 0;
        if (dp[index][am] != -1) return dp[index][am];
        int pick = 0;
        if (am >= coins[index]) pick = helper(coins, am - coins[index], index, dp);
        int nopick = helper(coins, am, index - 1, dp);
        dp[index][am] = pick + nopick;
        return dp[index][am];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:- ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.print("Enter elements:- ");
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();
        System.out.print("Enter sum:- ");
        int amount = sc.nextInt();
        System.out.print(change(amount, coins));
    }
}
