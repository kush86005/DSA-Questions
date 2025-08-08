package Top200;

import java.util.*;
public class Question5 {
    public static double TotalSalary(double b,char g){
        double total=0;
        double h=(20*b)/100;
        double d=(50*b)/100;

        int allow=0;
        if(g=='A'){
            allow=1700;
        }else if(g=='B'){
            allow=1500;
        }else {
            allow=1300;
        }
        double p=(11*b)/100;
        total=b+h+d+allow-p;
        return total;
    }
    public static void main(String[] args){
        System.out.print("Enter basic salary:- ");
        Scanner sc=new Scanner(System.in);
        double b=sc.nextInt();

        System.out.print("Enter grade:- ");
        char g= sc.next().charAt(0);

        double answer=TotalSalary(b,g);
        long rounded=Math.round(answer);
        System.out.print(rounded);
    }
}
