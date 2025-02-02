import java.util.*;

public class Function7 {
    public static int CalculateOddSum(int n){
        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
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
