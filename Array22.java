import java.util.*;

public class Array22{
    public static int MinimumJumps() {

        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];

        int jump = 0;
        int destination = size - 1;
        int coverage = 0;
        int lastindex = 0;

        System.out.print("Enter elements:- ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        if (size == 1) {
            return 0;
        }

        for (int i = 0; i < size; i++) {
            coverage = Math.max(coverage, i + number[i]);

            if (i == lastindex) {
                lastindex = coverage;
                jump++;

            if (coverage >= destination) {
                break;
            }
        }
    }
        return jump;
    }
    public static void main(String[] args){
        System.out.print("The Minimum jumps required:- "+MinimumJumps());
    }
}