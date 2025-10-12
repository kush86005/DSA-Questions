package Backtracking;
import java.util.*;

public class Question05{

    public static void helper(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j = 0; j < n; j++) {
            if (safe(board, row, j)) {
                board[row][j] = 'Q';
                helper(board, row + 1);
                board[row][j] = 'x';  // backtrack
            }
        }
    }

    public static boolean safe(char[][] board, int row, int col) {
        int n = board.length;

        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='x';
            }
        }
        helper(board, 0);
    }
}
