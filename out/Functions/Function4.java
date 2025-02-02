import java.util.*;

public class Function4 {
    public static int CalculateDiv(int a,int b){
        int result=0;

        if(b==0){
            System.out.println("Invalid input");
        }else{
            result=a/b;
        }
        return result;
    }
    public static void main(String[] args){

        System.out.print("Enter Number 1:- ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.print("Enter Number 2:- ");
        int b=sc.nextInt();

        System.out.print("The Answer is:- "+CalculateDiv(a,b));
    }
}