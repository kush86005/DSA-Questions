package Queue;
import java.util.*;
public class Question03 {

    public static void main(String[] args) {
        // Create a Deque (using LinkedList as implementation)
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to both ends
        deque.addFirst(10);   // Add to the front
        deque.addLast(20);    // Add to the rear
        deque.offerFirst(5);  // Another way to add to front
        deque.offerLast(25);  // Another way to add to rear

        System.out.println("Deque after additions: " + deque);

        // Accessing elements from both ends (without removal)
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements from both ends
        deque.removeFirst();  // Removes front element
        deque.removeLast();   // Removes last element

        System.out.println("Deque after removals: " + deque);

        // Using poll methods (they return null if empty)
        deque.pollFirst();
        deque.pollLast();

        System.out.println("Deque after polling: " + deque);

        // Check if deque is empty
        if (deque.isEmpty()) {
            System.out.println("Deque is now empty.");
        }

        // Adding elements again to demonstrate iteration
        deque.add(100);
        deque.add(200);
        deque.add(300);

        // Iterate through the deque
        System.out.println("Iterating through deque:");
        for (int num : deque) {
            System.out.println(num);
        }
    }
}
