package Top200;

import java.util.*;

public class Question28 {
    public static int pair(int[] arr, int n){
        int count=0;
        int s=arr.length;
        HashSet<Integer> find=new HashSet<>();
        HashSet<Integer> used=new HashSet<>();
        for(int i=0;i<s;i++){
            find.add(arr[i]);
        }

        for(int i=0;i<s;i++){
            int value=n-arr[i];
            if(find.contains(value)&&find.contains(arr[i])&&!used.contains(value)&&!used.contains(arr[i])){
                used.add(value);
                used.add(arr[i]);
                count++;
            }else{
                continue;
            }
        }
        return count;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number:- ");
        int num=sc.nextInt();

       int ans=pair(arr,num);
       System.out.print(ans);
    }
}
