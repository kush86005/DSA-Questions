import java.util.*;

public class Searching3 {
    public static int Index(int[] arr, int x){

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int mid=left+(right-left)/2;

            if(arr[mid]==x){
                return mid;
            }

            if(arr[left]<=arr[mid]){

                if(arr[left]<=x&&arr[mid]>=x){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else if(arr[mid]<=arr[right]){
                if(arr[mid]<=x&&arr[right]>=x){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];

        System.out.print("Enter Values:- ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter target:- ");
        int x=sc.nextInt();

        int result=Index(nums,x);
        System.out.print("Target present at index:- "+result);
    }
}
