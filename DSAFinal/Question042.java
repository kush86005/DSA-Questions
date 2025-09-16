package DSAFinal;
import java.util.*;
public class Question042 {
    public static int sqrt(int x){
        if(x==0||x==1) return x;

        int i=1;
        while(i<=x/i){
            if(i*i==x)return i;
            i++;
        }
        return i-1;
    }
    public static void main(String[] args){
        System.out.print("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(sqrt(n));
    }
}
