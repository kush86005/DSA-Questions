package LinkedList;
import java.util.*;
public class Question16 {
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
    public static void oddeven(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node oddhead=new Node(-1);
            Node evenhead=new Node(0);
            Node odd=oddhead;
            Node even=evenhead;
            Node temp=head;
            while(temp!=null){
                if(temp.data%2==0){
                    even.next=temp;
                    even=even.next;
                }else{
                    odd.next=temp;
                    odd=odd.next;
                }
                temp=temp.next;
            }
            even.next=null;
            odd.next=evenhead.next;
            head=oddhead.next;
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
        oddeven();
        print();
    }
}
