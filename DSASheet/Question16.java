package DSASheet;
import java.util.*;
public class Question16 {
    public static void Matrix(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;

        boolean[] row=new boolean[m];
        boolean[] column=new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||column[j]){
                    mat[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size of row:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print("Enter size of column:- ");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
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
