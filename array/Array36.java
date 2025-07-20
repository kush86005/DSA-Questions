package array;

import java.util.*;

public class Array36 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] num=new int[size];

        System.out.print("enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        Arrays.sort(num);

        int count=1;
        int ans=0;
        for(int i=0;i<size-1;i++){
            if(num[i+1]-num[i]==1){
                count++;
                ans=Math.max(ans,count);
            }else if(num[i+1]-num[i]!=1){
                count=1;
            }
        }
        System.out.print("Output:- "+ans);
    }
}
