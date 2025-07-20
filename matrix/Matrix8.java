package matrix;

import java.util.*;

public class Matrix8 {
    public static void main(String[] args) {
        System.out.print("Enter row:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        System.out.print("Enter column:- ");
        int c=sc.nextInt();

        int[][] num=new int[r][c];

        System.out.print("Enter values:- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=num[i][j];
                num[i][j]=num[j][i];
                num[j][i]=temp;
            }
        }
        int bottom=r-1;
        int left=0;
        int right=c-1;

        while(left<right){
            int top=0;
            while(top<=bottom) {
                int temp = num[top][left];
                num[top][left] = num[top][right];
                num[top][right] = temp;
                top++;
            }
            left++;
            right--;
        }

        System.out.print("Rotated matrix:- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
