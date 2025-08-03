package Top200;

import java.util.*;


public class MarksAverage {
    public static int Average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){

        System.out.print("Enter name:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.print("Enter S1:- ");
        int m1=sc.nextInt();

        System.out.print("Enter S2:- ");
        int m2=sc.nextInt();

        System.out.print("Enter S3:- ");
        int m3=sc.nextInt();

        int ans=Average(m1,m2,m3);
        System.out.println(s);
        System.out.print(ans);
    }
}
