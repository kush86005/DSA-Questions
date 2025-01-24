import java.util.*;

public class Function6 {
    public static int CalculateAverage(int a,int b,int c){
        int result=0;
        result=(a+b+c)/3;

        return result;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:- ");
        int a=sc.nextInt();

        System.out.print("Enter number 2:- ");
        int b=sc.nextInt();

        System.out.print("Enter number 3:- ");
        int c=sc.nextInt();

        System.out.print("The Average of 3 numbers= "+CalculateAverage(a,b,c));
    }
}