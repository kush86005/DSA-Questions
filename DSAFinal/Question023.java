package DSAFinal;
import java.util.*;
public class Question023 {
    public static int stock(int[] arr){
        int n=arr.length;
        int ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                ans+=arr[i]-arr[i-1];
            }
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
        int ans=stock(arr);
        System.out.print(ans);
    }
}
