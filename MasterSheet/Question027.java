package MasterSheet;
import java.util.*;
public class Question027 {
    public static int binary(int[] arr,int target){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>target){
                j=mid-1;
            }else if(arr[mid]<target){
                i=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
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
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        int ans=binary(arr,target);
        System.out.print(ans);
    }
}
