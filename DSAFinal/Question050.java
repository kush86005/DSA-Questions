package DSAFinal;
import java.util.*;
public class Question050 {
    public static int peak(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
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
        int ans=peak(arr);
        System.out.print(ans);
    }
}
