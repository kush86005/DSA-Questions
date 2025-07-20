package array;

import java.util.*;

public class Array43 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int num[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int min=0;

        int diff=Integer.MAX_VALUE;

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(num[i]+num[j]>k){
                    min=j-i;
                    min=Math.min(diff,min);
                }
            }
        }
        System.out.print("Smallest Subarray is of length:- "+min);
    }
}