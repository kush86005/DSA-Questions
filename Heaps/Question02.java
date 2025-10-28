package Heaps;
import java.util.*;

public class Question02 {

    public static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    public static void buildHeap(int[] arr) {
        int n = arr.length;
        int start = n / 2 - 1;

        for (int i = start; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void print(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 0};

        buildHeap(arr);
        print(arr);
    }
}
