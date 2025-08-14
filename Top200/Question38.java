package Top200;
import java.util.*;
public class Question38 {
    public static int SecondLargest(int[] arr){
        int s=arr.length;
        int largest=0;
        int second=0;
        for(int i=0;i<s;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
        }
        return second;
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
        int ans=SecondLargest(arr);
        System.out.print(ans);
    }
}
