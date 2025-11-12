package DynamicProgramming;
import java.util.*;
public class Question18 {
    public static int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(m-1,n-1,dp);
    }
    public static int helper(int m,int n,int[][] dp){
        if(m==0&&n==0){
            dp[m][n]=1;
            return dp[m][n];
        }
        if(m<0||n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n]=helper(m-1,n,dp)+helper(m,n-1,dp);
        return dp[m][n];
    }
    public static void main(String[] args) {
        System.out.print("Enter m:- ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.print("Enter n:- ");
        int n=sc.nextInt();
        int ans=uniquePaths(m,n);
        System.out.print(ans);
    }
}
