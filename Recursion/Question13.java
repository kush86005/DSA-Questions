package Recursion;
import java.util.*;
public class Question13 {
    public static int sumarr(int[] arr,int ind){
        if(ind==arr.length-1){
            return arr[ind];
        }
        return arr[ind]+sumarr(arr,ind+1);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=sumarr(arr,0);
        System.out.print(ans);
    }
}
