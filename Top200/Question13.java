package Top200;
import java.util.*;

public class Question13{
    public static void PrimeNumber(int n){

        if(n<2){
            System.out.print("Invalid Input");
        }
        for(int i=2;i<=n;i++){
            boolean isTrue=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isTrue=false;
                    break;
                }
            }if(isTrue){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        PrimeNumber(n);
    }
}