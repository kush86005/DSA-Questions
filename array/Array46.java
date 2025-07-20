package array;

import java.util.*;

public class Array46 {
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter size 2:- ");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.print("Enter values:- ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter values:- ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int k = n + m;

        int num[] = new int[k];

        for (int i = 0; i < n; i++) {
            num[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            num[n+i] = b[i];
        }
        Arrays.sort(num);
        int median = 0;

        if (k % 2 != 0) {
            median = num[k / 2];
        } else {
            median = (num[k / 2] + num[k / 2 - 1])/2;
        }
        System.out.print("Median is:- "+median);
    }
}