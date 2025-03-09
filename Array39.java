import java.util.*;

public class Array39 {
    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("Enter values:- ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size:- ");
        int m = sc.nextInt();

        int b[] = new int[m];

        System.out.print("Enter values:- ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> Freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Freq.put(a[i], Freq.getOrDefault(a[i], 0) + 1);
        }


        HashMap<Integer, Integer> frq = new HashMap<>();
        for (int i = 0; i < m; i++) {
            frq.put(b[i], frq.getOrDefault(b[i], 0) + 1);
        }


        boolean isSubset = true;
        for (Map.Entry<Integer, Integer> entry : frq.entrySet()) {
            int freqB = entry.getValue();
            int freqA = Freq.getOrDefault(entry.getKey(), 0);
            if (freqA < freqB) {
                isSubset = false;
                break;
            }
        }

        // Print result
        if (isSubset) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
