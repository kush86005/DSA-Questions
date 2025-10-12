package Backtracking;
import java.util.*;
public class Question04 {
    public static void permutation(int[] arr,List<List<Integer>> ans,int index){
        int n=arr.length;
        if(index==n){
            List<Integer> list=new ArrayList<>();
            for(int curr:arr){
                list.add(curr);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<n;i++){
            swap(arr,i,index);
            permutation(arr,ans,index+1);
            swap(arr,i,index);
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans=new ArrayList<>();
        permutation(arr,ans,0);
        System.out.print(ans);
    }
}
