import java.util.*;

public class Searching17 {
    public static int SortedRotatedMin(int[] arr){

        int low=0;
        int high=arr.length-1;

        while(low<high){

            int mid=low+(high-low)/2;

            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr=new int[n];

       System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=SortedRotatedMin(arr);
        System.out.print("Minimum element is:- "+ans);
    }
}
