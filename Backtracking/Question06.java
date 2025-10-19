package Backtracking;
import java.util.*;
public class Question06 {
    private static final int[][] moves={
            {2,1},{-2,-1},{-2,1},{2,-1},
            {1,2},{-1,-2},{-1,2},{1,-2}
    };
    public static boolean helper(int[][] grid,int row,int col,int num){
        int n=grid.length;
        if(num==n*n-1){
            return true;
        }
        for(int i=0;i<8;i++){
            int newrow=row+moves[i][0];
            int newcol=col+moves[i][1];

            if(newrow>=0&&newrow<n&&newcol>=0&&newcol<n&&grid[newrow][newcol]==-1){
                grid[newrow][newcol]=num+1;
                if(helper(grid,newrow,newcol,num+1)){
                    return true;
                }
                grid[newrow][newcol]=-1;
            }
        }
        return false;
    }
    public static ArrayList<ArrayList<Integer>> print(int n){
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=-1;
            }
        }
        grid[0][0]=0;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(helper(grid,0,0,0)){
            for(int i=0;i<n;i++){
                ArrayList<Integer> row=new ArrayList<>();
                for(int j=0;j<n;j++){
                    row.add(grid[i][j]);
                }
                ans.add(row);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> ans=print(n);
        System.out.print(ans);
    }
}
