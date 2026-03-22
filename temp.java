import java.util.*;

public class temp {
    public static boolean dup(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     int[] arr=new int[]{1,2,3,4};
     boolean ans=dup(arr);
     System.out.print(ans);
    }
}