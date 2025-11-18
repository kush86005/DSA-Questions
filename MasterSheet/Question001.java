package MasterSheet;
import java.util.*;
public class Question001 {
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int[] ans=new int[2];
        for(int i=0;i<arr.length;i++){
            int val=target-arr[i];
            if(map.containsKey(val)){
                ans[0]=i;
                ans[1]=map.get(val);
                break;
            }
        }
        return ans;
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
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        int[] ans=twoSum(arr,target);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
