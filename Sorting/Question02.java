package Sorting;
import java.util.*;
public class Question02 {
    public static void insertionsort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                int temp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter number:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}