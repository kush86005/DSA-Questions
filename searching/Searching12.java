package searching;

import java.util.*;

public class Searching12 {
    public static int FindSubarray(int[] arr){

        Map<Integer,Integer> Final=new HashMap<>();

        int sum=0;
        int ans=0;

        Final.put(0,1);

        for(int i=0;i<arr.length;i++){
            int num=arr[i];

            sum+=num;

            if(Final.containsKey(sum)){
                ans+=Final.get(sum);
            }
            Final.put(sum,Final.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int ans=FindSubarray(num);
        System.out.print(ans);
    }
}
