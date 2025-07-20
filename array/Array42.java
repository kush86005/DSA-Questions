package array;

import java.util.*;

public class Array42 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        if(size<3){
            System.out.print("Invalid Output");
            return;
        }
        int num[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        Arrays.sort(num);

        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<size-k;i++){
            int diff=num[i+k-1]-num[i];

            minDiff=Math.min(minDiff,diff);
        }

        System.out.print("Minimum difference is:- "+minDiff);
    }
}
