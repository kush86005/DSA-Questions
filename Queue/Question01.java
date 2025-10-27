package Queue;
import java.util.*;
public class Question01 {
    public class QueueClass {
        int front;
        int rear;
        int size;
        int[] queue;
        QueueClass(int size) {
            this.size = size;
            queue = new int[size];
            front = 0;
            rear = -1;
        }
        public boolean isEmpty() {
            return rear < front;
        }
        public boolean isFull() {
            return rear == size - 1;
        }
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return queue[front];
        }
        public void offer(int n) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            queue[++rear] = n;
        }
        public void poll() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            front++;
        }
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Question01 outer = new Question01();
        QueueClass q = outer.new QueueClass(5);

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.display();

        q.poll();
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
