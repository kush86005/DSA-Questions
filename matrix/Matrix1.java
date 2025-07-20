package matrix;

import java.util.*;

public class Matrix1 {
    public static void main(String[] args) {

        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];

        System.out.println("Enter values for the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int[] number = new int[r * c];
        int k = 0;

        int top = 0, bottom = r - 1, left = 0, right = c - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                number[k++] = num[top][j];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                number[k++] = num[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    number[k++] = num[bottom][j];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    number[k++] = num[i][left];
                }
                left++;
            }
        }

        System.out.println("Spiral Order: ");
        for (int i = 0; i < r * c; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
