package MasterSheet;
import java.util.*;
public class Question062 {
    public static List<Integer> TopKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[1] - b[1]
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            ans.add(minHeap.poll()[0]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;

        List<Integer> res = TopKFreq(arr, k);
        System.out.println(res);
    }
}