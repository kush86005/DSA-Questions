package Recursion;
import java.util.*;
//This not the best approach solution yet done only to understand recursion
public class Question20 {
    public static int helper(int s,int e,int row,int col){
        if(s>row||e>col){
            return 0;
        }
        if(s==row&&e==col){
            return 1;
        }
        return helper(s+1,e,row,col)+helper(s,e+1,row,col);
    }

    public static void main(String[] args) {
        System.out.print("Enter row:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print("Enter col:- ");
        int c=sc.nextInt();
        int count=helper(1,1,r,c); //1,1 because every rat will start from index (1,1)
        System.out.print(count);
    }
}
