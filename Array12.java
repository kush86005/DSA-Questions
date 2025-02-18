import java.util.*;

public class Array12 {
    public static void main(String[] args) {

        // Step 1: Get the size of the array and the elements from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // Step 2: Get the value of k (the k-th largest element to find)
        System.out.print("Enter the value of k (to find k-th largest): ");
        int k = sc.nextInt();

        // If k is greater than the size of the array, print an error message
        if (k > size) {
            System.out.println("Invalid input: k cannot be larger than the size of the array.");
            return;
        }

        // Step 3: Loop to find the k-th largest element
        int largest = Integer.MIN_VALUE;

        // Find the k-th largest element by repeating the search k times
        for (int i = 0; i < k; i++) {
            largest = Integer.MIN_VALUE;  // (number[i] should be Integer.MIN_VALUE)

            // Step 4: Find the largest element in the current iteration
            for (int j = 0; j < size; j++) {
                if (number[j] > largest) {
                    largest = number[j];
                }
            }

            // Mark the largest element as "used" (by setting it to Integer.MIN_VALUE)
            for (int j = 0; j < size; j++) {
                if (number[j] == largest) {
                    number[j] = Integer.MIN_VALUE;  // Mark it as used so it's not selected again
                    break;
                }
            }
        }

        // After the loop, 'largest' will hold the k-th largest element
        System.out.println("The " + k + "-th largest element is: " + largest);
    }
}

