package Queue;
import java.util.*;
public class Question02 {
    public class CircularQueue {
        int front;
        int rear;
        int size;
        int[] queue;
        int count;  // to keep track of number of elements

        CircularQueue(int size) {
            this.size = size;
            queue = new int[size];
            front = 0;
            rear = -1;
            count = 0;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == size;
        }

        public void offer(int n) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            rear = (rear + 1) % size; // wrap around using modulo
            queue[rear] = n;
            count++;
        }

        public void poll() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            front = (front + 1) % size; // move front circularly
            count--;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return queue[front];
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = 0; i < count; i++) {
                System.out.print(queue[(front + i) % size] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueExample outer = new CircularQueueExample();
        CircularQueue q = outer.new CircularQueue(5);

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        q.display();

        q.poll();
        q.poll();

        q.display();

        q.offer(60);
        q.offer(70);

        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
