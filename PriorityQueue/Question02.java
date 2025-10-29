package PriorityQueue;
import java.util.*;
public class Question02 {
    public static void main(String[] args){
        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        maxpq.offer(10);
        maxpq.offer(20);
        maxpq.offer(41);
        maxpq.offer(0);
        System.out.println("Highest priority element:- "+maxpq.peek());
        System.out.println(maxpq.contains(41));
        System.out.println("Deleted:- "+maxpq.poll());
        System.out.print(maxpq.contains(41));
    }
}
