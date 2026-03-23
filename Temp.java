import java.util.*;

public class Temp{
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
    public static Node reverse(Node node){
        if(node==null) {
            return null;
        }

        Node prev=null;
        Node curr=node;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void print(Node node){
        if(node==null){
            System.out.print("Emoty Linked List");
            return;
        }
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            insert(val);
        }
        Node node=reverse(head);
        print(node);
    }
}
