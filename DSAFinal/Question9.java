package DSAFinal;
import java.util.*;
public class Question9 {
    public static void moveZero(int[] arr){
        int n=arr.length;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[zero];
                arr[zero]=arr[i];
                arr[i]=temp;
                zero++;
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZero(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
