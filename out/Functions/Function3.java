import java.util.*;

public class Function3{
    public static int CalculateMul(int a,int b){
        int result=0;
        result=a*b;
        return result;
    }
    public static void main(String[] args){

        System.out.print("Enter Number 1:- ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.print("Enter Number 2:- ");
        int b=sc.nextInt();

        System.out.print("The Answer is:- "+CalculateMul(a,b));
    }
}