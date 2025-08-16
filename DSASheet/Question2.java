package DSASheet;
import java.util.*;
public class Question2 {
    public static int TwoSum(int[] arr,int target){
        HashMap<Integer,Integer> digit=new HashMap<>();
        int s=arr.length;
        int count=0;
        for(int i=0;i<s;i++){
            int ans=target-arr[i];

            if(digit.containsKey(ans)){
                count+=digit.get(ans);
            }

            digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();

        int ans=TwoSum(arr,target);
        System.out.print("Total number of pairs:- "+ans);
    }
}
