package matrix;

import java.util.*;

public class Matrix6 {
    public static void main(String[] args) {

        System.out.println("Enter row:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        System.out.println("Enter column:- ");
        int C=sc.nextInt();

        int[][] num=new int[r][C];

        for(int i=0;i<r;i++){
            for(int j=0;j<C;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for(int a=0;a<r;a++){
            for(int b=0;b<C;b++){
                for(int c=0;c<r;c++){
                    for(int d=0;d<C;d++){
                        if(c>a&&d>b){
                            ans=Math.max(ans,(num[c][d]-num[a][b]));
                        }
                    }
                }
            }
        }
        System.out.print(ans);
    }
}
