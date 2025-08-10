package Top200;

import java.util.*;
public class Question10 {
    public static void PrintAlpha(int n){

        char c='A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        PrintAlpha(n);
    }
}
