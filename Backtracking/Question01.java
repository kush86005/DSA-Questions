package Backtracking;
import java.util.*;
public class Question01 {
    public static int helper(int s,int e,int row,int col,int[][] maze){
        if (s < 0 || e < 0 || s >= row || e >= col || maze[s][e] == 0 || maze[s][e] == -1) {
            return 0;
        }
        if(s==row-1&&e==col-1){
            return 1;
        }
        maze[s][e]=-1;
        int count=0;
        count+= helper(s,e+1,row,col,maze);
        count+=helper(s+1,e,row,col,maze);
        count+=helper(s,e-1,row,col,maze);
        count+=helper(s-1,e,row,col,maze);
        maze[s][e]=1;
        return count;
    }

    public static void main(String[] args) {
        int row=3;
        int col=4;
        int[][] maze={{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        int count=helper(1,1,row,col,maze);
        System.out.print(count);
    }
}
