import java.util.*;

public class String14 {
    public static void main(String[] args) {

        System.out.print("Enter rows:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        System.out.print("Enter columns:- ");
        int c=sc.nextInt();

        String[][] grid=new String[r][c];

        sc.nextLine();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j]=sc.nextLine();
            }
        }

        System.out.print("Enter string:- ");
        String str=sc.nextLine();

        int[] rowDir={-1,1,0,0,-1,-1,1,1};
        int[] colDir={0,0,-1,1,-1,1,-1,1};

        boolean found=false;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j].charAt(0)==str.charAt(0)){

                    for(int dir=0;dir<8;dir++){

                        int k;
                        for( k=1;k<str.length();k++){
                            int newrow=i+k*rowDir[dir];
                            int newcol=j+k*colDir[dir];

                            if(newrow<0||newrow>=r||newcol<0||newcol>=c||grid[newrow][newcol].charAt(0)!=str.charAt(k)){
                                break;
                            }
                            }
                        if(k==str.length()){
                            found=true;
                            System.out.print("Word found at index"+i+" "+j);
                        }
                    }
                }
            }
        }
        if(!found){
            System.out.print("Word not found in the grid");
        }
    }
}
