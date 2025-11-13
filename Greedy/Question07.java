package Greedy;
import java.util.*;
public class Question07 {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=rocks.length;
        int diff[]=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(diff);
        int count=0;
        for(int i=0;i<diff.length;i++){
            if(diff[i]<=additionalRocks){
                additionalRocks-=diff[i];
                diff[i]=0;
            }
            if(diff[i]==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] cap=new int[]{2,3,4,5};
        int[] rocks=new int[]{1,2,4,4};
        int add=2;
        int ans=maximumBags(cap,rocks,add);
        System.out.print(ans);
    }
}
