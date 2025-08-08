package Top200;

import java.util.*;
public class Question7 {
    public static void main(String[] args){

        System.out.print("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter power:- ");
        int p=sc.nextInt();

        int mul=1;
        for(int i=0;i<p;i++){
            mul=mul*n;
        }
        System.out.print(mul);
    }
}
