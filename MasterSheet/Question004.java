package MasterSheet;
import java.util.*;
public class Question004 {
    public static ArrayList<Integer> duplicate(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);

            if(map.get(nums)>1){
                ans.add(nums);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2, 3, 1, 2, 3};
        ArrayList<Integer> ans=duplicate(arr);
        System.out.print(ans);
    }
}
