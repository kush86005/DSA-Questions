import java.util.*;

public class Array47 {
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter values:- ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int median = 0;

        if (n % 2 != 0) {
            median = a[n / 2];
        } else {
            median = (a[n / 2] + a[n / 2 - 1])/2;
        }
        System.out.print("Median is:- "+median);
    }
}
