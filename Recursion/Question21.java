package Recursion;
import java.util.*;
public class Question21 {
    private static final int[][] moves={
            {2,1},{-2,-1},{-2,1},{2,-1},
            {1,2},{-1,-2},{-1,2},{1,-2}
    };
    public static boolean helper(int[][] grid,int row,int col,int num){
        int n=grid.length;
        if(grid[row][col]==n*n-1){
            return true;
        }
        for(int i=0;i<8;i++){
            int newrow=row+moves[i][0];
            int newcol=col+moves[i][1];

            if(newrow>=0&&newrow<n&&newcol>=0&&newcol<n&&grid[newrow][newcol]==num+1){
                if(helper(grid,newrow,newcol,num)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid=new int[n][n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        boolean ans=helper(grid,0,0,0);
        System.out.print(ans);
    }
}
