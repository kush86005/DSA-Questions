import java.util.*;

public class LinkedList1 {
    public static void reverseList(LinkedList<Integer> list){
        Collections.reverse(list);
    }
    public static void main(String[] args){

        System.out.print("Enter size of string:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();

        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        reverseList(list);

        System.out.print("Reversed list"+list);
    }
}