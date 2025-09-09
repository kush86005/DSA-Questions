package DSAFinal;
import java.util.*;
public class Question031 {
    public static ArrayList<Integer> subarray(int[] arr,int k){
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            for(int j=i;j<i+k;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            result.add(max);
        }
        return result;
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
        System.out.print("Enter K:- ");
        int k=sc.nextInt();
        ArrayList<Integer> result=subarray(arr,k);
        System.out.print(result);
    }
}
