package PriorityQueue;
import java.util.*;
public class Question01 {
    public static void main(String[] args){
        //Min priorityQueue Execution
        PriorityQueue<Integer> minpq=new PriorityQueue<>();

        minpq.offer(10);
        minpq.offer(28);
        minpq.offer(45);
        minpq.offer(50);

        System.out.println("Priority element in min priority queue:- "+minpq.peek());

        //Max priorityQueue Execution
        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        maxpq.offer(10);
        maxpq.offer(28);
        maxpq.offer(45);
        maxpq.offer(50);

        System.out.println("Priority element in Max priority queue:- "+maxpq.peek());
    }
}
