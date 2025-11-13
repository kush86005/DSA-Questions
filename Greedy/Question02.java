package Greedy;
import java.util.*;
public class Question02 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> (a[1]-b[1]));
        int n=intervals.length;
        int removed=0;
        int last=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<last){
                removed++;
            }else{
                last=intervals[i][1];
            }
        }
        return removed;
    }
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2},{2,3},{3,4},{1,3}};
        int ans=eraseOverlapIntervals(arr);
        System.out.print(ans);
    }
}
