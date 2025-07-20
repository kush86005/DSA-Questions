package array;

import java.util.*;

public class Array21 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        System.out.print("Enter Values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        Arrays.sort(number);

        System.out.print("Enter K:- ");
        int k=sc.nextInt();

        int max,min,ans;

        ans=number[size-1]-number[0];

        for(int i=1;i<size;i++){
            if(number[i]>=k){
                max=Math.max(number[i-1]+k,number[size-1]-k);
                min=Math.min(number[i]-k,number[0]+k);
                ans=Math.min(ans,max-min);
            }else{
                continue;
            }
        }
        System.out.print("The Minimum maximum differnce between height is:- "+ans);
    }
}
