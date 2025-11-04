package DynamicProgramming;
import java.util.*;
//Memoization(Top-down approach where we are going till bottom from top)
public class Question02 {
    public static int fib(int n){
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return dphelper(n,dp);
    }
    public static int dphelper(int n,int[] dp){
        if(n<=1){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=dphelper(n-1, dp) + dphelper(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.print(ans);
    }
}
