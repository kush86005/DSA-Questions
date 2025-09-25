package LinkedList;
import java.util.*;
public class Question08 {
    //delete a node where only the adress of that node and nodes ahead of it is given. adress of nodes before it is not given
    //Leetcode 237

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
            head=null;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=val;
        }
    }
    public static void delete(int input){
        input.data=input.next.data;
        input.next=input.next.next;
    }
}
