import java.util.*;

public class Function{
    public static int CalculateSum(int a,int b){

        int result=0;
        result=a+b;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:- ");
        int a=sc.nextInt();

        System.out.print("Enter number 2:-");
        int b=sc.nextInt();

        System.out.print("The answer is:- "+CalculateSum(a,b));
    }
}

