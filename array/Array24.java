package array;

import java.util.*;

public class Array24 {
    public static void main(String[] args) {

        System.out.print("Enter size for array 1:- ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.print("Enter Values:- ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Enter size of array 2:- ");
        int size2 = sc.nextInt();

        int[] num = new int[size2];

        System.out.print("Enter Values:- ");
        for (int i = 0; i < size2; i++) {
            num[i] = sc.nextInt();
        }

        int[] sum = new int[size + size2];

        for (int i = 0; i < size; i++) {
            sum[i] = number[i];
        }
        for (int i = 0; i < size2; i++) {
            sum[size + i] = num[i];
        }
        for (int i = 0; i < sum.length - 1; i++) {
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[i] > sum[j]) {
                    int temp = sum[i];
                    sum[i] = sum[j];
                    sum[j] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            number[i] = sum[i];
        }
        for (int i = 0; i < size2; i++) {
            num[i] = sum[size+i];
        }
        System.out.print("A1:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();

        System.out.print("A2:- ");
        for(int i=0;i<size2;i++){
            System.out.print(+num[i]+" ");
        }
    }
}