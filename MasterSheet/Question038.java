package MasterSheet;
import java.util.*;
public class Question038 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
            tail=val;
        }else{
            tail.next=val;
            tail=val;
        }
    }
    public static boolean cycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Question038 list = new Question038();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.tail.next = list.head.next;

        if (cycle(list.head)) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
