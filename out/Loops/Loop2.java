import java.util.*;

public class Loop2 {
    public static void main(String[] args){

        int sum=0;
        int i,n;

        System.out.print("Enter Number:- ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();


        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("The answer is:- "+sum);
    }
}
