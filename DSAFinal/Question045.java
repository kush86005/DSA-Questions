package DSAFinal;
import java.util.*;
public class Question045 {
    public static int search(int[] nums,int k){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k) return mid;

            if(nums[low]<=nums[mid]){
                if(nums[low]<=k&&nums[mid]>=k){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]<=nums[high]){
                if(nums[mid]<k&&nums[high]>=k){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
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
        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        System.out.print(search(arr,k));
    }
}
