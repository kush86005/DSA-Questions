package DSAFinal;
import java.util.*;

public class Question021 {
    public static void mergeSorted(int m, int n, int[] num1, int[] num2) {
        int i = m - 1;
        int j = n - 1;
        int k = num1.length - 1;

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        while (j >= 0) {
            num1[k--] = num2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of num1 array: ");
        int s1 = sc.nextInt();
        System.out.print("Enter m (elements in num1): ");
        int m = sc.nextInt();
        int[] num1 = new int[s1];
        System.out.println("Enter elements of num1:");
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }

        System.out.print("Enter size of num2 array: ");
        int s2 = sc.nextInt();
        System.out.print("Enter n (elements in num2): ");
        int n = sc.nextInt();
        int[] num2 = new int[s2];
        System.out.println("Enter elements of num2:");
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }

        mergeSorted(m, n, num1, num2);

        System.out.println("Merged sorted array:");
        for (int i = 0; i < s1; i++) {
            System.out.print(num1[i] + " ");
        }
    }
}
