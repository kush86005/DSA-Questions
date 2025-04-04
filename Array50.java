import java.util.*;

public class Array50 {
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int smallnum =0;
        for(int i=0;i<n;i++){
            if(num[i]<=k){
                smallnum++;
            }
        }
        int count=0;
        for(int i=0;i<smallnum;i++){
            if(num[i]>k){
                count++;
            }
        }
        System.out.print("Min swaps:- "+count);
    }
}
