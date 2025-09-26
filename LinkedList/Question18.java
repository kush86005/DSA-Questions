package LinkedList;
import java.util.*;
public class Question18 {
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
    public static void duplicates(){
        Node temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.data==temp.next.data){
                    temp.next = temp.next.next;
            }else{
                temp=temp.next;
            }
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
        duplicates();
        print();
    }
}
