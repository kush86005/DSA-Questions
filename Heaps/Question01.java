package Heaps;
import java.util.*;

public class Question01 {

    // Function to heapify a subtree rooted at index i in arr[]
    // n is size of heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // left child = 2*i + 1
        int right = 2 * i + 2; // right child = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Function to build a max heap from array
    public static void buildHeap(int[] arr) {
        int n = arr.length;

        // Index of last non-leaf node
        int startIdx = n / 2 - 1;

        // Perform reverse level order traversal from last non-leaf node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Utility function to print the array
    public static void printHeap(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Example main method to test the code
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};

        System.out.println("Original array:");
        printHeap(arr);

        buildHeap(arr);

        System.out.println("After building max heap:");
        printHeap(arr);
    }
}
