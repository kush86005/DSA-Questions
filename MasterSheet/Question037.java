package MasterSheet;

public class Question037 {
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

    public void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
            tail=val;
        }else{
            tail.next=val;
            tail=val;
        }
    }
    public static int mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Question037 list = new Question037();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        int ans=mid(list.head);
        System.out.print(ans);
    }
}
