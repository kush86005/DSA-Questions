package searching;

import java.util.*;

public class Searching1 {
    public static ArrayList<Integer> FirstLast(int[] arr, int x){

        int n=arr.length;

        ArrayList<Integer> Final=new ArrayList<>();

        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1){
                    first = i;
                }
                    last = i;
            }
        }
        Final.add(first);
        Final.add(last);

        return Final;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int num[]=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter Number:- ");
        int x=sc.nextInt();

        ArrayList<Integer> result= FirstLast(num,x);
        System.out.print(result);
    }
}
