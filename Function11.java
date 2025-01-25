import java.util.*;

public class Function11 {
    public static void CalculateEligiblity(int a){

        if(a>=18){
            System.out.print("Eligible to vote");
        }else{
            System.out.print("Not Eligible to vote");
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:- ");
        int a=sc.nextInt();

        CalculateEligiblity(a);
    }
}
