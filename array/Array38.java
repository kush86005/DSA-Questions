package array;

import java.util.*;

public class Array38 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] num=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int profit=0;

        for(int i=0;i<size-1;i++){
            if(num[i]<num[i+1]){
                profit +=num[i+1]-num[i];
            }
        }
        System.out.print("The maximum profit will be:- "+profit);
    }
}
