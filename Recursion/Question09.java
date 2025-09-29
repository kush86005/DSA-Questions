package Recursion;
import java.util.*;
public class Question09 {
    public static int gcd(int x,int y){
       if(y==0){
           return x;
       }
       return gcd(y,x%y);
    }

    public static void main(String[] args) {
        System.out.print("Enter x:- ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("Enter y:- ");
        int y=sc.nextInt();
        int ans=gcd(x,y);
        System.out.print(ans);
    }
}
