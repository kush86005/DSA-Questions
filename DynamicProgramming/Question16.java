package DynamicProgramming;
import java.util.*;
public class Question16 {
        public static int longestPalindromeSubseq(String s) {
            String rev = new StringBuilder(s).reverse().toString();
            int n = s.length();
            int[][] dp = new int[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dp[i], -1);
            }
            return helper(n, n, s, rev, dp);
        }
        public static int helper(int n, int m, String s1, String s2, int[][] dp) {
            if (n == 0 || m == 0) {
                return 0;
            }
            if (dp[n][m] != -1) {
                return dp[n][m];
            }
            if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
                dp[n][m] = 1 + helper(n - 1, m - 1, s1, s2, dp);
            } else {
                int case1 = helper(n - 1, m, s1, s2, dp);
                int case2 = helper(n, m - 1, s1, s2, dp);
                dp[n][m] = Math.max(case1, case2);
            }
            return dp[n][m];
        }
    public static void main(String[] args) {
        System.out.print("Enter string :- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=longestPalindromeSubseq(s);
        System.out.print(ans);
    }
}
