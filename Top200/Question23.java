package Top200;
import java.util.*;
public class Question23 {
    public static void Interchange(int[] arr){

        int size=arr.length;
        int i=0;
        while(i<size-1){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            i+=2;   //So that the swapped numbers are not swapped again, i+=2 instead of i++
        }
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Interchange(arr);
    }
}
