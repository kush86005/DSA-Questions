package MasterSheet;
import java.util.*;
public class Question002 {
    public static int twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int val=target-arr[i];
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        int ans=twoSum(arr,target);
        System.out.print(ans);
    }
}
