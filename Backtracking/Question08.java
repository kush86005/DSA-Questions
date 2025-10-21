package Backtracking;
import java.util.*;
public class Question08 {
    public static boolean isvalid(char[][] board,int row,int col,char num){
        for(int i=0;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(board[row][j]==num){
                return false;
            }
        }
        int newrow=(row/3)*3;
        int newcol=(col/3)*3;
        for(int i=newrow;i<newrow+3;i++){
            for(int j=newcol;j<newcol+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                char num=board[i][j];
                board[i][j]='.';
                if(!isvalid(board,i,j,num))return false;
                board[i][j]=num;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=sc.next().charAt(0);
            }
        }
        boolean isTrue=isValidSudoku(board);
        System.out.print(isTrue);
    }
}

