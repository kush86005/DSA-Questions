package Greedy;
import java.util.*;
public class Question06 {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int res=0;
        for(int[] box:boxTypes){
            if(truckSize==0){
                break;
            }
            if(truckSize<=box[0]){
                res+=(truckSize*box[1]);
                truckSize=0;
            }else{
                res+=box[0]*box[1];
                truckSize-=box[0];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] box=new int[][]{{1,3},{2,2},{3,1}};
        int trucksize=4;
        int ans=maximumUnits(box,trucksize);
        System.out.print(ans);
    }
}
