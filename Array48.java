import java.util.*;

public class Array48 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] num=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int i=0;
        int j=size-1;
        int count=0;

        while (i < j) {
            if (num[i] == num[j]) {
                i++;
                j--;
            } else if (num[i] < num[j]) {
                num[i] = num[j] - num[i];
                count++;
                i++;
            } else {
                num[j] = num[i] - num[j];
                count++;
                j--;
            }
        }
        System.out.print(count);
    }
}
