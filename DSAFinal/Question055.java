package DSAFinal;

public class Question055 {
 /*   class Solution {
        public boolean isPalindrome(Node head) {
            if (head == null || head.next == null) return true;

            // Step 1: Find the middle
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse the second half
            Node secondHalf = reverseList(slow);

            // Step 3: Compare both halves
            Node firstHalf = head;
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        // Helper method to reverse a linked list
        private Node reverseList(Node head) {
            Node prev = null;
            while (head != null) {
                Node nextNode = head.next;
                head.next = prev;
                prev = head;
                head = nextNode;
            }
            return prev;
        }
    }
    */
}
