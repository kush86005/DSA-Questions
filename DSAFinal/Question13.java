package DSAFinal;
import java.util.*;
public class Question13 {
    public static int[] suffix(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        int suffix=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]*=suffix;
            suffix*=arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=suffix(arr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
