package DSAFinal;
import java.util.*;
public class Question22 {
    public static int stock(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int count:arr){
            if(count<min){
                min=count;
            }
            int profit=count-min;
            if(ans<profit){
                ans=profit;
            }
        }
        return ans;
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
        int ans=stock(arr);
        System.out.print(ans);
    }
}
