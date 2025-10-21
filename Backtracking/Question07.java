package Backtracking;
import java.util.*;
public class Question07 {
    private static final int[][] moves = {
            {2, 1}, {-2, -1}, {-2, 1}, {2, -1},
            {1, 2}, {-1, -2}, {-1, 2}, {1, -2}
    };
    private static boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;
        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 'k') {
                return false;
            }
        }
        return true;
    }
    private static void placeKnights(char[][] grid, int row, int col, ArrayList<ArrayList<Character>> ans) {
        int n = grid.length;
        if (row == n) {
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    list.add(grid[i][j]);
                }
            }
            ans.add(list);
            return;
        }
        if (isSafe(grid, row, col)) {
            grid[row][col] = 'k';
            if (col == n - 1) {
                placeKnights(grid, row + 1, 0, ans);
            } else {
                placeKnights(grid, row, col + 1, ans);
            }
            grid[row][col] = '.';
        }
        if (col == n - 1) {
            placeKnights(grid, row + 1, 0, ans);
        } else {
            placeKnights(grid, row, col + 1, ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.'; // Empty space
            }
        }

        ArrayList<ArrayList<Character>> ans = new ArrayList<>();
        placeKnights(grid, 0, 0, ans);
        System.out.println("Possible knight configurations:");
        for (ArrayList<Character> config : ans) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(config.get(i * n + j) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
