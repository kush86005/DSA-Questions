package Heaps;
import java.util.*;

public class Question04 {
    // Heapify function for max heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Build max heap
    public static void buildHeap(int[] arr) {
        int n = arr.length;
        int start = n / 2 - 1;

        for (int i = start; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Delete (extract) the maximum element from heap
    public static int[] delete(int[] arr, int n) {
        if (n <= 0) {
            System.out.println("Heap is empty!");
            return new int[0];
        }

        int max = arr[0];  // root element (max)
        arr[0] = arr[n - 1]; // move last element to root

        // Restore heap property for remaining elements
        heapify(arr, n - 1, 0);

        // Copy remaining elements into new array (excluding last)
        int[] newHeap = Arrays.copyOf(arr, n - 1);

        System.out.println("Deleted max element: " + max);
        return newHeap;
    }

    // New: Change value at a given index and re-heapify
    public static void changeValue(int[] arr, int index, int newValue) {
        int n = arr.length;
        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
            return;
        }

        int oldValue = arr[index];
        arr[index] = newValue;

        System.out.println("Changed index " + index + " from " + oldValue + " to " + newValue);

        // If new value is greater → may need to move up
        if (newValue > oldValue) {
            // Move up until heap property is satisfied
            int parent = (index - 1) / 2;
            while (index > 0 && arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;

                index = parent;
                parent = (index - 1) / 2;
            }
        } else {
            // If new value is smaller → heapify down
            heapify(arr, n, index);
        }
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

        // ✅ Example of changing a value
        changeValue(arr, 2, 10);  // Increase value at index 2
        System.out.println("Heap after changing value at index 2 to 10:");
        print(arr);

        changeValue(arr, 1, 1);   // Decrease value at index 1
        System.out.println("Heap after changing value at index 1 to 1:");
        print(arr);
    }
}
