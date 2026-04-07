package MasterSheet;
import java.util.*;
public class Question059 {
    public static int[] kthLargest(int k, int[] arr, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);

            if(pq.size()>k){
                pq.poll();
            }

            if(pq.size()<k){
                ans[i]=-1;
            }else{
                ans[i]=pq.peek();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter K:- ");
        int k=sc.nextInt();
        int[] ans=kthLargest(k,arr,n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+", ");
        }
    }
}
