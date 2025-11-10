package DynamicProgramming;
import java.util.*;
public class Question12 {
    public static int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans= helper(coins,amount,n-1,dp);
        if(ans==(int)(1e9)){
            return -1;
        }
        return ans;
    }
    public static int helper(int[] coins,int am,int index,int[][] dp){
        if(am==0){
            return 0;
        }
        if(index<0){
            return (int)(1e9);
        }
        if(dp[index][am]!=-1){
            return dp[index][am];
        }
        int pick=(int)(1e9);
        if(am>=coins[index]){
            pick=1+helper(coins,am-coins[index],index,dp);
        }
        int nopick=helper(coins,am,index-1,dp);
        dp[index][am]=Math.min(pick,nopick);
        return dp[index][am];
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter values:- ");
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        System.out.print("Enter amount:- ");
        int amount=sc.nextInt();
        int ans=coinChange(coins,amount);
        System.out.print(ans);
    }
}
