package DynamicProgramming;
import java.util.*;
public class Question10 {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        int[][] dp=new int[N+1][K+1];
        return helper(arr,K,N-1,dp);
    }
    public static boolean helper(int[] arr,int k,int index,int[][] dp){
        if(k==0){
            dp[index][k]=1;
            return true;
        }
        if(index==0){
            if(k==arr[index]){
                dp[index][k]=1;
                return true;
            }else{
                dp[index][k]=2;
                return false;
            }
        }
        if(dp[index][k]!=0){
            if(dp[index][k]==1){
                return true;
            }else{
                return false;
            }
        }
        boolean pick=true;
        if(arr[index]<=k){
            pick=helper(arr,k-arr[index],index-1,dp);
            if(pick){
                return true;
            }
        }
        boolean nopick=helper(arr,k,index-1,dp);
        if(nopick==true){
            dp[index][k]=1;
        }
        else{
            dp[index][k]=2;
        }
        return nopick;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target sum:- ");
        int k=sc.nextInt();

        boolean ans=checkSubsequenceSum(n,arr,k);
        System.out.print(ans);
    }
}
