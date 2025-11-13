package Greedy;
import java.util.*;
public class Question03 {
    public static int findMinArrowShots(int[][] points) {
        int n=points.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(points,(a,b)->Long.compare(a[1],b[1])); //Constraints have very large number of values, So used Long.compare
        int arrows=1;
        int last=points[0][1];
        for(int i=1;i<n;i++){
            if(points[i][0]>last){
                arrows++;
                last=points[i][1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        int[][] arr=new int[][]{{10,16},{2,8},{1,6},{7,12}};
        int ans=findMinArrowShots(arr);
        System.out.print(ans);
    }
}
