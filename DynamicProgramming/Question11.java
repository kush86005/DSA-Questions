package DynamicProgramming;
import java.util.*;
public class Question11 {
    public static int knapsack(int W, int val[], int wt[]) {
        int n=val.length;
        int[][] dp=new int[n][W+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(val,wt,W,n-1,dp);
    }
    public static int helper(int[] val,int[] wt,int w,int index,int[][] dp){
        if(w==0||index<0){
            return 0;
        }
        if(w<wt[index]){
            dp[index][w]=helper(val,wt,w,index-1,dp);
            return dp[index][w];
        }
        if(dp[index][w]!=-1){
            return dp[index][w];
        }

        int pick=val[index]+helper(val,wt,w-wt[index],index-1,dp);
        int nopick=0+helper(val,wt,w,index-1,dp);
        dp[index][w]=Math.max(pick,nopick);
        return dp[index][w];
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] val=new int[n];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        System.out.print("Enter weights:- ");
        int[] wt=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        System.out.print("Enter maximum capacity:- ");
        int capacity=sc.nextInt();
        int ans=knapsack(capacity,val,wt);
        System.out.print(ans);
    }
}
