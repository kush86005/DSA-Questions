package DynamicProgramming;
import java.util.*;
public class Question19 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(m - 1, n - 1, obstacleGrid, dp);
    }
    public static int helper(int m, int n, int[][] obstacleGrid, int[][] dp) {
        if (m < 0 || n < 0 || obstacleGrid[m][n] == 1) {
            return 0;
        }
        if (m == 0 && n == 0) {
            return 1;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = helper(m - 1, n, obstacleGrid, dp) + helper(m, n - 1, obstacleGrid, dp);
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m:- ");
        int m = sc.nextInt();
        System.out.print("Enter n:- ");
        int n = sc.nextInt();
        int[][] obstacleGrid = new int[m][n];
        System.out.println("Enter the grid:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                obstacleGrid[i][j] = sc.nextInt();
            }
        }
        int ans = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(ans);
    }
}
