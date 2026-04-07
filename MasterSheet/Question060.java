package MasterSheet;
import java.util.*;
public class Question060 {
    //For largest element in the array
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int arr:nums){
            pq.offer(arr);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.peek();
    }
    //For smallest element in the array
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr){
            pq.offer(num);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.peek();
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
        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int largest=findKthLargest(arr,k);
        int smallest=kthSmallest(arr,k);

        System.out.println("Largest:- "+largest);
        System.out.print("Smallest:- "+smallest);
    }
}
