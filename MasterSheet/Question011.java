package MasterSheet;
import java.util.*;
public class Question011 {
    public static int subarray(int[] arr,int k){
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:arr){
            sum+=num;
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10, 2, -2, -20, 10};
        int target=-10;
        int ans=subarray(arr,target);
        System.out.print(ans);
    }
}
