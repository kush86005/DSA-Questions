package searching;

import java.util.*;

public class Searching13 {
    public static int[] FindPuzzle(int[] arr){

        int n=arr.length;

        int[] left=new int[n];
        int[] right=new int[n];
        int[] sol=new int[n];

        for(int i=0;i<n;i++) {
            int leftsum = 1;
            int rightsum = 1;

            for (int j = i - 1; j >= 0; j--) {
                leftsum *= arr[j];
            }
            left[i] = leftsum;

            for (int p = i + 1; p < n; p++) {
                rightsum *= arr[p];
            }
            right[i] = rightsum;
        }

        for(int i=0;i<n;i++){
            sol[i]=left[i]*right[i];
        }
        return sol;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
        }
        int[] result=FindPuzzle(num);
        System.out.print(Arrays.toString(result));
    }
}