package Top200;
import java.util.*;
public class Question21 {
    public static boolean Fib(int n){

        boolean isTrue=false;
        int a=1;
        int b=1;

        while(b<=n){
            if(b==n){
                isTrue=true;
                break;
            }
            int temp=b;
            b=b+a;
            a=temp;
        }
        return isTrue;
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean ans=Fib(n);
        System.out.print(ans);
    }
}
