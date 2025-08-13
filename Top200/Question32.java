package Top200;
import java.util.*;
public class Question32 {
    public static int BinarySearch(int[] arr, int n){
        int s=arr.length;

        int first=0;
        int last=s-1;

        while(first<=last) {
           int mid=first+(last-first)/2;
            if (arr[mid]== n) {
                return mid;
            }else if(arr[mid]>n){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();

        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();

        int ans=BinarySearch(arr,target);
        System.out.print(ans);
    }
}
