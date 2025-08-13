package Top200;
import java.util.*;
public class Question34 {
    public static void SelectionSort(int[] arr){
        int s= arr.length;

        for(int i=0;i<s-1;i++){
            int small=i;
            for(int j=i+1;j<s;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
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
        SelectionSort(arr);

        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
