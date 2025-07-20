package matrix;

import java.util.*;

public class Matrix7 {
    public static void main(String[] args) {

        System.out.print("Enter N:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        int[][] num=new int[r][r];

        System.out.print("Enter values:- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                num[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp=num[i][j];
                num[i][j]=num[j][i];
                num[j][i]=temp;
            }
        }
        System.out.print("Transpose matrix:- ");
        for(int m=0;m<r;m++){
            for(int n = 0; n <r; n++){
                System.out.print(num[m][n]+" ");
            }
            System.out.println();
        }
    }
}
