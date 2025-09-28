package Recursion;
import java.util.*;
public class Question01 {
    public static void print(int n){
        if(n==1){
            System.out.print(1+" ");  //This is know as halting condition/Base case. Without this the code will throw stack overflow error
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
