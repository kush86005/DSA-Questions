package Top200;

import java.util.*;

public class Question6 {
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int evensum=0; int oddsum=0;
        while(n>0){
            int last=n%10;
            if(last%2==0){
                evensum+=last;
            }else{
                oddsum+=last;
            }
            n=n/10;
        }
        System.out.print(evensum+" "+oddsum);
    }
}
