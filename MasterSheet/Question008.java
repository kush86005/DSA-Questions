package MasterSheet;
import java.util.*;
public class Question008 {
    public static int longest(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int total=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int ans=num;
                int count=1;
                while(set.contains(ans+1)){
                    count++;
                    ans++;
                }
                total=Math.max(total,count);
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2, 6, 1, 9, 4, 5, 3};
        int ans=longest(arr);
        System.out.print(ans);
    }
}
