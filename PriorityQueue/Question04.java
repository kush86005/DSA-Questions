package PriorityQueue;
import java.util.*;
public class Question04 {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a max heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Step 3: Add all entries to the max heap
        maxHeap.addAll(freqMap.entrySet());

        // Step 4: Extract top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll().getKey());
        }

        return result;
    }

    // Example test case
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int k = 2;
        System.out.println("Top " + k + " frequent elements: " + topKFrequent(nums, k));
    }
}

