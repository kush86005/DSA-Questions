package LinkedList;
import java.util.*;
public class Question20 {
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
    public static int maximum(){
        if(head==null||head.next==null){
            return head.data;
        }
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
        Node first=head;
        Node second=prev;
        int ans=Integer.MIN_VALUE;
        while(second!=null){
            int max=first.data+second.data;
            ans=Math.max(ans,max);
            first=first.next;
            second=second.next;
        }
        return ans;
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
        int ans=maximum();
        System.out.print("Maximum sum is:- "+ans);
    }
}
