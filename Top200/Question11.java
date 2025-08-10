package Top200;

import java.util.*;
public class Question11 {
    public static void PrintSpace(int n){

        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        PrintSpace(n);
    }
}
