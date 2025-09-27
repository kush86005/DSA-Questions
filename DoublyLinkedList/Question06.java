package DoublyLinkedList;
import java.util.*;
public class Question06 {
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
    public static boolean palindrome(){
        if(head==null||head.next==null){
            return true;
        }
        Node temp1=head;
        Node temp2=tail;
        boolean isTrue=true;
        while(temp1!=temp2){
            if(temp1.data!=temp2.data){
                isTrue=false;
                break;
            }else{
                temp1=temp1.next;
                temp2=temp2.prev;
            }
        }
        return isTrue;
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
        boolean ans=palindrome();
        System.out.print(ans);
    }
}
