package DynamicProgramming;
import java.util.*;
public class Question14 {
    public static int cutRod(int[] price) {
        int n = price.length;
        int[][] dp = new int[n + 1][n];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(price, n, n - 1, dp);
    }
    private static int helper(int[] price, int n, int index, int[][] dp) {
        if (index == 0) {
            return n * price[0];
        }
        if (dp[n][index] != -1) {
            return dp[n][index];
        }
        int notTake = helper(price, n, index - 1, dp);
        int take = Integer.MIN_VALUE;
        int rodLength = index + 1;

        if (n >= rodLength) {
            take = price[index] + helper(price, n - rodLength, index, dp);
        }
        dp[n][index] = Math.max(take, notTake);
        return dp[n][index];
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=cutRod(arr);
        System.out.print(ans);
    }
}