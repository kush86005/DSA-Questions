package Greedy;
import java.util.*;
//This problem can be solved using recursion(Brute force)
public class Question08 {
    public static boolean canJump(int[] nums) {
        int maxjump=0;
        int n=nums.length;
        int i=0;
        while(i<=maxjump){
            maxjump=Math.max(maxjump,i+nums[i]);
            if(maxjump>=(n-1)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
     int[] arr=new int[]{2,3,1,1,4};
     boolean ans=canJump(arr);
     System.out.print(ans);
    }
}
