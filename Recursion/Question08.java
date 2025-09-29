package Recursion;
import java.util.*;
public class Question08 {
    public static int sum(int n,int sign){
        if(n==1){
            return 1*sign;
        }
        return sign*n+sum(n-1,-sign);
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int ans=sum(n,1);
       System.out.print(ans);
    }
}