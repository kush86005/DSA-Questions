package DynamicProgramming;
import java.util.*;
public class Question05 {
    public static int stairs(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
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