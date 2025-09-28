package Recursion;
import java.util.*;
public class Question06 {
    public static double power(double n,double m){
        if(m==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(m==1){
            return n;
        }
        return n*power(n,m-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        System.out.print("Enter power:- ");
        double m=sc.nextInt();
        double ans=power(n,m);
        System.out.print(ans);
    }
}
