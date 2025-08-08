package Top200;

import java.util.*;
public class Question4 {
    public static void Celsius(int s,int e,int f){

        int cel=0;
        int i=s;
        while(i<=e){
            cel=(i-32)*5/9;
            System.out.print(i+" "+cel);
            System.out.println();
            i=i+f;
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Start:- ");
        int s=sc.nextInt();

        System.out.print("Enter end:- ");
        int e=sc.nextInt();

        System.out.print("Enter step:- ");
        int f=sc.nextInt();

        Celsius(s,e,f);
    }
}
