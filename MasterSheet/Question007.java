package MasterSheet;
import java.util.*;
public class Question007 {
    public static ArrayList<Integer> freq(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap=new PriorityQueue<>((a,b)->{
        if(!a.getValue().equals(b.getValue())){
            return b.getValue()-a.getValue();
        }else{
            return b.getKey()-a.getKey();
        }
    });
        ArrayList<Integer> ans=new ArrayList<>();
        maxheap.addAll(map.entrySet());
        for(int i=0;i<k;i++){
            ans.add(maxheap.poll().getKey());
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k=4;
        ArrayList<Integer> ans=freq(arr,k);
        System.out.print(ans);
    }
}
