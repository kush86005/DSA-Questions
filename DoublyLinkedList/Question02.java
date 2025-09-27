package DoublyLinkedList;
import java.util.*;
public class Question02 {
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
    public static void main(String[] args){
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        print();
    }
}
