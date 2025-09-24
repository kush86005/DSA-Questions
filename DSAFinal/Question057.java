package DSAFinal;
import java.util.*;
public class Question057 {
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
    public static void reorderList(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr=slow;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        Node start=head;
        Node mid=prev;
        while(start!=mid&&mid!=null&&mid.next!=null){
            Node temp1=start.next;
            Node temp2=mid.next;

            start.next=mid;
            mid.next=temp1;

            start=temp1;
            mid=temp2;
        }
        if(mid!=null&&mid.next==null){
            mid.next=null;
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
        System.out.print("Number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter number if elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        reorderList();
        System.out.print("The list is:- ");
        print();
    }
}
