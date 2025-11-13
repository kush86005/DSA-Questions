package Greedy;
import java.util.*;
public class Question04 {
    public static int assignHole(int[] mices, int[] holes) {
        int n=mices.length;
        Arrays.sort(mices);
        Arrays.sort(holes);
        int Maxtime=0;
        for(int i=0;i<n;i++){
            Maxtime=Math.max(Maxtime,Math.abs(mices[i]-holes[i]));
        }
        return Maxtime;
    }
    public static void main(String[] args) {
        int[] mices=new int[]{4,-4,2};
        int[] holes=new int[]{4,0,5};
        int ans=assignHole(mices,holes);
        System.out.print(ans);
    }
}
