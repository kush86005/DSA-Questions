package Backtracking;
import java.util.*;
public class Question09 {
        public static boolean valid(int[][] mat, int row, int col, int num) {
            for (int i = 0; i < 9; i++) {
                if (mat[row][i] == num) {
                    return false;
                }
            }
            for (int i = 0; i < 9; i++) {
                if (mat[i][col] == num) {
                    return false;
                }
            }
            int newRow = (row / 3) * 3;
            int newCol = (col / 3) * 3;
            for (int i = newRow; i < newRow + 3; i++) {
                for (int j = newCol; j < newCol + 3; j++) {
                    if (mat[i][j] == num) {
                        return false;
                    }
                }
            }

            return true;
        }
        public static boolean helper(int[][] mat, int row, int col) {
            if (row == 9) {
                return true;
            }
            if (col == 9) {
                return helper(mat, row + 1, 0);
            }
            if (mat[row][col] != 0) {
                return helper(mat, row, col + 1);
            }
            for (int num = 1; num <= 9; num++) {
                if (valid(mat, row, col, num)) {
                    mat[row][col] = num;
                    if (helper(mat, row, col + 1)) {
                        return true;
                    }
                    mat[row][col] = 0;
                }
            }
            return false;
        }
        public static void main(String[] args){
            System.out.print("Enter n:- ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n>9){
                System.out.print("Invalid input");
                return;
            }
            System.out.print("Enter elements:- ");
            int[][] grid=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    grid[i][j]=sc.nextInt();
                }
            }
            helper(grid,0,0);
        }
}
