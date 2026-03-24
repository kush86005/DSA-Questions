import java.util.*;

public class Temp {
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
    public static Node reverse(Node val){
        if(val==null){
            System.out.print("Empty list");
            return null;
        }
        Node prev=null;
        Node curr=val;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void print(Node val){
        if(val==null){
            System.out.print("Empty List");
            return;
        }
        while(val!=null){
            System.out.print(val.data+" ");
            val=val.next;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            insert(num);
        }
        Node ans=reverse(head);
        print(ans);
    }
}
