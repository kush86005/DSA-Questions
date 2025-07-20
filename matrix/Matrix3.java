package matrix;

import java.util.*;

public class Matrix3 {
    public static void main(String[] args){

        System.out.print("Enter rows:- ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        if(r%2==0) {
            System.out.print("Invalid Input");
            return;
        }

        System.out.print("Enter columns:- ");
        int c=sc.nextInt();

        if(c%2==0){
            System.out.print("Invalid input");
            return;
        }

        int[][] num=new int[r][c];

        System.out.print("Enter values:- ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j]=sc.nextInt();
            }
        }
        List<Integer> number=new ArrayList<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                number.add(num[i][j]);
            }
        }
        Collections.sort(number);
        int size=number.size();
        int median;

        if (size % 2 == 0) {
            median = (number.get(size / 2 - 1) + number.get(size / 2)) / 2;
        } else {
            median = number.get(size / 2);
        }

        System.out.print("Median for matrix is:- "+median);
    }
}
