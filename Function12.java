import java.util.*;

public class Function12 {
    public static double CalculatePower(double a,double b){
         double result=0;

         result=Math.pow(a,b);

         return result;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base number:- ");
        double a=sc.nextInt();

        System.out.print("Enter Exponent number:- ");
        double b=sc.nextInt();

        System.out.print("The answer is:- "+CalculatePower(a,b));
    }
}
