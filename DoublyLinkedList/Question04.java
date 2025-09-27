package DoublyLinkedList;
import java.util.*;
public class Question04 {
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
    public static void delete(int val){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node temp=head;
            while(temp!=null){
                if(temp.data!=val){
                    temp=temp.next;
                }else{
                    if(temp==head){
                        head=head.next;
                        if(head!=null){
                            head.prev=null; //If the new head is not null
                            // (i.e., the list isn't empty after deletion), we clear its prev link (because it's now the first node).
                        }else{
                            tail=null;//If the head became null, that means the list is now empty (we deleted the only node in the list).
                            //So we must also set tail = null to reflect that the list is fully empty.
                        }
                    }else if(temp==tail){
                        tail=tail.prev;//We check: Is the node to delete (temp) the tail?
                        //If yes, move the tail pointer to the previous node.
                        if(tail!=null){
                            tail.next=null; //If the new tail is not null, set its next to null because it's now the last node.
                            //If tail is null, it means the list is empty.
                        }
                    }else{
                        temp.prev.next=temp.next;
                        temp.next.prev=temp.prev;
                    }
                    return;
                }
            }
            System.out.print("The element doesn't exist");
            return;
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
        System.out.print("Enter element to delete:- ");
        int delete=sc.nextInt();
        delete(delete);
        print();
    }
}