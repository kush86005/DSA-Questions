package array;

import java.util.*;

public class Array37{
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] num = new int[size];

        System.out.print("Enter values:- ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter K:- ");
        int k = sc.nextInt();

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < size; i++) {
            count.put(num[i], count.getOrDefault(num[i], 0) + 1);
        }

        int x = size / k;

        System.out.print("The numbers that repeat " + x + " times are:- ");
        for (Map.Entry<Integer, Integer> number : count.entrySet()) {
            if (number.getValue() > x) {
                System.out.print(number.getKey() + ",");
            }
        }
    }
}
