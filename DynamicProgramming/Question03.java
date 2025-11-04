package DynamicProgramming;
import java.util.*;
//Tabulation(bottom-up approach)
public class Question03 {
    public static int fib(int n){
        int[] dp=new int[n+1];
        if(n<=1){
            return n;
        }
        dp[0]=0;
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
        int ans=fib(n);
        System.out.print(ans);
    }
}
