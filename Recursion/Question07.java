package Recursion;
import java.util.*;
public class Question07 {
    public static void multiple(int k, int m){
        if(m==0){
            return;
        }
        multiple(k,m-1);
        System.out.print(k*m+" ");
    }

    public static void main(String[] args) {
        System.out.print("Enter k:- ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.print("Enter m:- ");
        int m=sc.nextInt();
        multiple(k,m);
    }
}
