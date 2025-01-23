import java.util.*;

public class Function{
    public static void CalculateEquation(int a,int b,int n){
        int sum = a;
        for (int j = 0; j < n; j++) {
            sum += Math.pow(2, j) * b;
            System.out.print(sum + " ");
        }
        System.out.println();


    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            CalculateEquation(a, b, n);

        }
    }
}
