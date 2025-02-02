import java.util.*;

public class Function9{
    public static void Findbigger(int a,int b){
        if(a>b){
            System.out.print(a+" is greater");
        }else if(a == b){
            System.out.print("Both numbers are equal");
        }else{
            System.out.print(b+" is greater");
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a=sc.nextInt();

        System.out.print("Enter number 2: ");
        int b=sc.nextInt();

        Findbigger(a,b);
    }
}