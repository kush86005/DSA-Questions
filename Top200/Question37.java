package Top200;

import java.util.Scanner;

public class Question37 {
    public static void Reverse1(int[] arr, int target){
        int s=arr.length;
        int z=-1;
        for(int i=0;i<s;i++){
            if(arr[i]==target){
                z=i;
                break;
            }
        }
        if(z==-1){
            System.out.print("Invalid Input");
            return;
        }
        int i=0;
        int j=z;
        while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        int k=z+1;
        int q=s-1;
        while(q>k){
            int temp=arr[k];
            arr[k]=arr[q];
            arr[q]=temp;
            k++;
            q--;
        }
        i=0;
        q=s-1;
        while(i<q){
            int temp=arr[i];
            arr[i]=arr[q];
            arr[q]=temp;
            i++;
            q--;
        }
        for(int m = 0; m <s; m++){
            System.out.print(arr[m]+" ");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        Reverse1(arr,target);
    }
}
