package Top200;
import java.util.*;
public class Question31 {
    public static void Print(int[] arr){
        int s=arr.length;

        int i=0;
        int j=s-1;
        while(i<j){
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
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
        Print(arr);

        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
