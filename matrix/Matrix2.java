package matrix;

import java.util.*;

public class Matrix2 {
    public static void main(String[] args){
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];

        System.out.println("Enter values for the matrix (sorted row and column): ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number: ");
        int k = sc.nextInt();

        boolean found = false;
        int row = 0, col = c - 1;

        while (row < r && col >= 0) {
            if (num[row][col] == k) {
                found = true;
                break;
            } else if (num[row][col] > k) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print(found);
    }
}
