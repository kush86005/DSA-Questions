package array;

import java.util.*;

public class Array41{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int num[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int leftmax[]=new int[size];
        int rightmax[]=new int[size];

        leftmax[0]=num[0];
        for(int i=1;i<size;i++){
            leftmax[i]=Math.max(num[i],leftmax[i-1]);
        }
        rightmax[size-1]=num[size-1];
        for(int i=size-2;i>=0;i--){
            rightmax[i]=Math.max(num[i],rightmax[i+1]);
        }
        int ans=0;

        for(int i=0;i<size;i++) {
            ans += Math.min(leftmax[i], rightmax[i]) - num[i];
        }
        System.out.print("Water Trapped:- "+ans);
    }
}