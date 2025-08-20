package DSASheet;
import java.util.*;
public class Question11 {
    public static int[] ProductExcept(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*arr[i-1];
        }
        int suffix=arr[n-1];
        for(int i=n-2;i>=0;i--){
            result[i]*=suffix;
            suffix*=arr[i];
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
        int[] result=ProductExcept(arr);
        for(int i=0;i<n;i++) {
            System.out.print(result[i]+" ");
        }
    }
}
