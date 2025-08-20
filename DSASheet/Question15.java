package DSASheet;
import java.util.*;
public class Question15 {
    public static void Matrix(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    for(int k=0;k<m;k++){
                        if(mat[k][j]!=0&&mat[k][j]!=Integer.MIN_VALUE){
                            mat[k][j]=Integer.MIN_VALUE;
                        }
                    }
                    for(int k=0;k<n;k++){
                        if(mat[i][k]!=0&&mat[i][k]!=Integer.MIN_VALUE){
                            mat[i][k]=Integer.MIN_VALUE;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==Integer.MIN_VALUE){
                    mat[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter number of rows:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print("Enter number of columns:- ");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.print("Enter elements:- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        Matrix(mat);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
