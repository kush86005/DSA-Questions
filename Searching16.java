import java.util.*;

public class Searching16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of ranges and queries
        System.out.print("Enter number of ranges: ");
        int n = sc.nextInt();

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        // Create a set to hold all numbers from all ranges
        TreeSet<Integer> numberSet = new TreeSet<>();

        // Read ranges and add all numbers in the ranges to the set
        for (int i = 0; i < n; i++) {
            System.out.print("Enter range " + (i + 1) + " (start and end): ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int val = start; val <= end; val++) {
                numberSet.add(val);
            }
        }

        // Convert TreeSet to a sorted list
        List<Integer> sortedList = new ArrayList<>(numberSet);

        // Read the queries
        int[] queries = new int[q];
        System.out.println("Enter the queries:");
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        // Process each query
        List<Integer> result = new ArrayList<>();
        for (int k : queries) {
            if (k <= sortedList.size()) {
                result.add(sortedList.get(k - 1)); // 1-based indexing
            } else {
                result.add(-1); // If k is larger than the list size
            }
        }

        // Print the result
        System.out.println("Output:");
        for (int res : result) {
            System.out.print(res + " ");
        }

        sc.close();
    }
}
