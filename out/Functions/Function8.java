import java.util.*;

public class Function8 {
    public static int CalculateOddSum(int n){

        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){

        System.out.print("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("The Answer is:- "+CalculateOddSum(n));
    }
}
