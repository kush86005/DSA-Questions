package Top200;

import java.util.*;
public class Question3 {
    public static int EvenSum(int n){
        int sum=0;
        for(int i=0;i<=n;i+=2){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){

        System.out.print("Enter N:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int answer=EvenSum(n);
        System.out.print(answer);
    }
}
