import java.util.*;

public class Switch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1) Addition 2) Subtraction 3) Multiplication 4) Division");
        System.out.print("Choose a operator:- ");
        int operator=sc.nextInt();

        System.out.print("Enter number 1:- ");
        int num1=sc.nextInt();

        System.out.print("Enter number 2:- ");
        int num2=sc.nextInt();

        int result=0;

        switch(operator){
            case 1: result=num1+num2;
            break;

            case 2: result=num1-num2;
            break;

            case 3: result=num1*num2;
            break;

            case 4:if(num2==0){
                System.out.println("Invalid input");
            }else{
                result=num1/num2;
            }
            break;
        }
        System.out.println("The Answer is:- "+result);
    }
}