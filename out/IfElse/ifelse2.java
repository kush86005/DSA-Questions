import java.util.*;

public class ifelse2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int a=sc.nextInt();

        if(a>=18){
            System.out.print("Eligible to vote");
        }else{
            System.out.print("Not eligible to vote");
        }
    }
}