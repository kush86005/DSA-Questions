package DoublyLinkedList;
import java.util.*;
public class Question01 {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static Node head=null;
    public static void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=val;
            val.prev=temp;
        }
    }
    public static void print(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void insertstart(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
        }else{
            val.next=head;
            val.prev=null;
            head.prev=val;
            head=val;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        print();
    }
}
