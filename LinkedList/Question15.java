package LinkedList;
import java.util.*;
public class Question15 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
        }
    }
    public static void oddeven(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }
        Node odd=new Node(-1);
        Node even=new Node(0);
        Node oddhead=odd;
        Node evenhead=even;
        Node temp=head;
        while(temp!=null){
            int ans=temp.data;
            if(ans%2==0){
                even.next=new Node(ans);
                even=even.next;
            }else{
                odd.next=new Node(ans);
                odd=odd.next;
            }
            temp=temp.next;
        }
        odd.next=evenhead.next;
        head=oddhead.next;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
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
