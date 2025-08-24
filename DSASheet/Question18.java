package DSASheet;
import java.util.*;
public class Question18 {
    public static int stockbuy(int[] arr){
        int maxprofit=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                maxprofit+=arr[i+1]-arr[i];
            }
        }
        return maxprofit;
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
        int ans=stockbuy(arr);
        System.out.print(ans);
    }
}
