package MasterSheet;
import java.util.*;
public class Question003 {
    public static boolean duplicate(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int nums:arr){
            if(set.contains(nums)){
                return true;
            }
            set.add(nums);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean ans=duplicate(arr);
        System.out.print(ans);
    }
}
