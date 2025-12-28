package MasterSheet;
import java.util.*;
public class Question041 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    int length=0;
    public void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
            tail=val;
        }else{
            tail.next=val;
            tail=val;
        }
        length++;
    }
    public void removenode(int k){
        if (k > length || k <= 0) return;
        if (k == length) {
            head = head.next;
            return;
        }
        int removal=length-k;
        Node curr=head;
        for(int i=0;i<removal-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Question041 list1=new Question041();

        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);

        list1.removenode(2);
        list1.printlist();
    }
}
