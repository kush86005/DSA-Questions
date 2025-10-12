package Backtracking;
import java.util.*;
//Its time and space complexity is O(n!*n). the time is same but it can be improved space wise
public class Question03 {
    public static void permutation(int[] arr, List<Integer> list,List<List<Integer>> ans,boolean[] curr){
        int n=arr.length;
        if(list.size()==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++){
            if(curr[i]==false) {
                curr[i] = true;
                list.add(arr[i]);
                permutation(arr, list, ans, curr);
                list.remove(list.size() - 1);
                curr[i] = false;
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] curr=new boolean[n];
        permutation(arr,list,ans,curr);
        System.out.print(ans);
    }
}
