package Top200;

import java.util.*;
public class Question9 {
    public static void Printing(int n) {

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Printing(n);
    }
}
