package LinkedList;
import java.util.*;

public class Question17 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail=null;

    public static void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
            tail=val;
        }else{
            tail.next=val;
            tail=val;
        }
    }

    public static void sortindex(){
        if(head==null||head.next==null){
            System.out.print(head);
            return;
        }
        Node odd=head;
        Node even=head.next;
        Node evenhead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        System.out.print("Enter the number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        sortindex();
        print();
    }
}
