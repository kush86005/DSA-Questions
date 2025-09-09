package DSAFinal;
import java.util.*;
public class Question024 {
    public static int[] square(int[] arr){
        int i=0;
        int j=arr.length-1;
        int k=arr.length-1;
        int[] ans=new int[arr.length];
        while(i<=j){
            int left=arr[i]*arr[i];
            int right=arr[j]*arr[j];
            if(left>right){
                ans[k--]=left;
                i++;
            }else{
                ans[k--]=right;
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] res=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            res[i]=sc.nextInt();
        }
        int[] ans=square(res);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
