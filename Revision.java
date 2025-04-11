import java.util.*;

public class Revision{
    public static void Minimize(int k,int[] arr){
        int n=arr.length;

        int min,max,ans;

        ans=arr[n-1]-arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>=k){
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                min=Math.min(arr[i]-k,arr[0]+k);
                ans=Math.min(ans,max-min);
            }
        }
        System.out.print("Minimum Height:- "+ans);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        Minimize(k,nums);
    }
}
