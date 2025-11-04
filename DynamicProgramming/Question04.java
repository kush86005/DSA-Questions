package DynamicProgramming;
import java.util.*;
public class Question04 {
    public static int stairs(int n){
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return dphelper(n,dp);
    }
    public static int dphelper(int n,int[] dp){
        if(n<=2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=dphelper(n-1,dp)+dphelper(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=stairs(n);
        System.out.print(ans);
    }
}