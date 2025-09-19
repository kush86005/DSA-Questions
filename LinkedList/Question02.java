package LinkedList;
import java.util.*;
public class Question02 {
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    public static void insert(String data){
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
    public static void print(){
        if(head==null){
            System.out.print("The list is empty");
        }else{
            Node val=head;
            while(val!=null){
                System.out.print(val.data+" ");
                val=val.next;
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter number if nodes:- ");
        Scanner sc=new Scanner(System.in);
        int nodes=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<nodes;i++){
            String data=sc.nextLine();
            insert(data);
        }
        System.out.print("Linked List:- ");
        print();
    }
}
