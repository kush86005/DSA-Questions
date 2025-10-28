package Heaps;
import java.util.*;
public class Question03 {
    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }

        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
    }
    public static void buildHeap(int[] arr){
        int n=arr.length;

        int start=n/2-1;
        for(int i=start;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    public static int[] delete(int[] arr,int n){
        if(n<=0){
            System.out.print("Heap is Empty");
            return new int[0];
        }

        int max=arr[0];
        arr[0]=arr[n-1];
        heapify(arr,n-1,0);

        // Copy remaining elements into new array (excluding last)
        int[] newHeap = Arrays.copyOf(arr, n - 1);

        System.out.print("Max element:- "+max);
        return newHeap;
    }
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 0};

        buildHeap(arr);
        System.out.println("Initial Max Heap:");
        print(arr);

        arr = delete(arr, arr.length);
        System.out.println("Heap after deleting max:");
        print(arr);
    }
}
