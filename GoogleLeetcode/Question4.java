package GoogleLeetcode;
import java.util.*;
public class Question4 {
    public static void arrange(long[] arr){
        int n=arr.length;
        long[] ans=new long[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[(int)arr[i]];
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];     //This loop is because according to question we dont return anything so we have update the
                              // values in original array
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arrange(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
