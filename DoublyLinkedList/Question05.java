package DoublyLinkedList;
import java.util.*;
public class Question05 {
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
    static Node tail=null;
    public static void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
            tail=val;
        }else{
            val.prev=tail;
            tail.next=val;
            tail=val;
        }
    }
    static Node t=null;
    public static void insertindex(int n){
        Node temp=head;
        for(int i=1;i<n;i++){
            temp=temp.next;
        }
        t=temp;
    }
    public static void insertvalue(int ans){
        Node num=new Node(ans);
        Node temp=t.next;
        num.prev=t;
        num.next=temp;
        t.next=num;

        if(temp!=null){
            temp.prev=num;
        }else{
            tail=num;
        }
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        System.out.print("Enter index:- ");
        int k=sc.nextInt();
        insertindex(k);
        System.out.print("Enter value:- ");
        int val=sc.nextInt();
        insertvalue(val);
        print();
    }
}
