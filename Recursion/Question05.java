package Recursion;
import java.util.*;
public class Question05 {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }

    public static void main(String[] args) {
        System.out.print("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.print(ans);
    }
}
