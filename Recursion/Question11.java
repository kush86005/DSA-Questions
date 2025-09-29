package Recursion;
import java.util.*;
public class Question11 {
    public static void printarray(int[] arr, int ind){
        if(ind==arr.length-1){
            System.out.print(arr[ind]+" ");
            return;
        }
        System.out.print(arr[ind]+" ");
        printarray(arr,ind+1);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printarray(arr,0);
    }
}
