package DSAFinal;
import java.util.*;
public class Question047 {
    public static boolean matrix(int[][] mat,int x){
        int r=mat.length;
        int c=mat[0].length;
        int left=0;int right=r*c-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            int matrix=mat[mid/c][mid%c];

            if(matrix==x){
                return true;
            }else if(matrix>x){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print("Enter row:- ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.print("Enter col:- ");
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter x:- ");
        int x=sc.nextInt();

        System.out.print(matrix(mat,x));
    }
}
