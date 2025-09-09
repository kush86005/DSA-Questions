package DSAFinal;
import java.util.*;
public class Question018 {
    public static int trappingrainwater(int[] arr){
        int n=arr.length;
        int[] left=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Ente size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=trappingrainwater(arr);
        System.out.print(ans);
    }
}
