package searching;

import java.util.*;

public class Searching9 {
    public static long Triplet(int sum, long[] arr){

        int n=arr.length;

        long count=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]<sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long[] arr=new long[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter sum:- ");
        int x= sc.nextInt();

        long ans=Triplet(x,arr);
        System.out.print(ans);
    }
}
