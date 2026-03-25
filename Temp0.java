import java.util.*;

public class Temp0 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node  tail=null;
    public static void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
            tail=head;
        }else{
            tail.next=val;
            tail=tail.next;
        }
    }
    public static Node reverse(Node head){
        if(head==null){
            return null;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        tail=prev;
        return prev;
    }
    public static void print(Node head){
        if(head==null){
            System.out.print("Empty Linked List");
            return;
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of elements:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            insert(num);
        }
        reverse(head);
        print(tail);
    }
}
