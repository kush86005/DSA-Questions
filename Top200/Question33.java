package Top200;
import java.util.*;
public class Question33 {
    public static void BubbleSort(int[] arr){

        int s=arr.length;

        for(int i=0;i<s-1;i++) {
            for (int j = i + 1; j < s; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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
        BubbleSort(arr);
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
