import java.util.*;

public class Matrix5 {
    public static void main(String[] args) {

        System.out.print("Enter N:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] num=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int number[]=new int[n*n];
        int k=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                number[k++]=num[i][j];
            }
        }
        Arrays.sort(number);

        k=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                num[i][j]=number[k++];
            }
        }
        System.out.print("Sorted matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}