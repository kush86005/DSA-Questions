package matrix;

import java.util.*;

public class Matrix9 {
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
        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        ArrayList<Integer> number=new ArrayList<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                number.add(num[i][j]);
            }
        }
        Collections.sort(number);

        int ans=number.get(k-1);

        System.out.print(ans);
    }
}
