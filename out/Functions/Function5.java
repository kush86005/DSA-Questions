import java.util.*;

public class Function5{
    public static void CalculateFactorial(int n){

        if(n<0){
            System.out.print("Invalid input");
            return;
        }
        int factorial=1;

        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("The Factorial is:- "+factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:- ");
        int n=sc.nextInt();

        CalculateFactorial(n);
    }
}