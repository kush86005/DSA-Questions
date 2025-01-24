import java.util.*;

public class Function2{
    public static int CalculateDiff(int a,int b){

        int result=0;
        result=a-b;
        return result;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:- ");
        int a=sc.nextInt();

        System.out.print("Enter number 2:- ");
        int b=sc.nextInt();

        System.out.print("The answer is:- "+CalculateDiff(a,b));
    }
}