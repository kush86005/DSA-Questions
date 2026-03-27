import java util.*;

public class temp {
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
            tail=head;
        }else{
            tail.next=val;
            tail=val;
        }
    }
    public static Node reverse(Node root){
        if(root==null){
            return null;
        }
        Node prev=null;
        Node curr=root;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
