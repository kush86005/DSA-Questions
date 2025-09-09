package DSAFinal;
import java.util.*;
public class Question027 {
    public static int closest(int[] arr,int target){
        int n=arr.length;
        int closest=Integer.MIN_VALUE;
        int maxDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int count=arr[i]+arr[j]+arr[k];
                    int diff=Math.abs(target-count);
                    if(diff<maxDiff||(diff==maxDiff&&count>closest)){
                        maxDiff=diff;
                        closest=count;
                    }
                }
            }
        }
        return closest;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        int ans=closest(arr,target);
        System.out.print(ans);
    }
}
