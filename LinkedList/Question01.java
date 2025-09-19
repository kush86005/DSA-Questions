package LinkedList;
import java.util.*;
public class Question01 {
    class Node{
        String data;
        Node next;

        Node(data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    public static void insertion(String data){
        Node val=new Node(data);

        if(head==null){
            head=val;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp=val;
        }
    }
    public static void printlist(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node val= head;
            while(val!=null){
                System.out.print(val.data+" ");
                val=val.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            String data=sc.nextLine();

            if(data.equalsIgnoreCase("exit")){
                break;
            }
            list.insert(data);
        }
        System.out.print("The list is:- ");
        list.printList();
    }
}
