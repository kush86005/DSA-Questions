package matrix;

import java.util.*;

public class Matrix4 {
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
        int left=0;
        int right=c-1;
        int top=0;
        int bottom=r-1;
        int end=0;
        int maxcount=-1;

        while(top<=bottom){
            int count=0;
            for(int j=left;j<=right;j++){
                if(num[top][j]==1){
                    count++;
                }
            }
            if(end<count) {
                maxcount = top;
            }
            end=Math.max(end,count);
            top++;
        }
        System.out.print(maxcount);
    }
}
