package DynamicProgramming;
import java.util.*;
public class Question15 {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n,m,text1,text2,dp);
    }
    public static int helper(int n,int m,String text1, String text2,int[][] dp){
        if(n==0||m==0){
            dp[n][m]=0;
            return dp[n][m];
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(text1.charAt(n-1)==text2.charAt(m-1)){
            dp[n][m]=1+helper(n-1,m-1,text1,text2,dp);
        }else{
            int case1=helper(n-1,m,text1,text2,dp);
            int case2=helper(n,m-1,text1,text2,dp);
            dp[n][m]=Math.max(case1,case2);
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        System.out.print("Enter String 1:- ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.print("Enter String 2:- ");
        String s2=sc.nextLine();
        int ans=longestCommonSubsequence(s1,s2);
        System.out.print(ans);
    }
}
