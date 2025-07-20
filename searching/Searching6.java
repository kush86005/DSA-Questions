package searching;

import java.util.*;

public class Searching6 {
    public static void Majority(int[] arr){

        int n=arr.length;

        int m=n/2;

        Map<Integer,Integer> Final=new HashMap<>();

        for(int i=0;i<n;i++){
            Final.put(arr[i], Final.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : Final.entrySet()) {
            if (entry.getValue() > m) {
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.print(-1);
    }

    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        Majority(num);
    }
}
