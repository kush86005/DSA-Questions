package DSASheet;
import java.util.*;
public class Temp {
    public static int stock(int[] arr){
        int n=arr.length;
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            int count=arr[i]-min;
            if(count>ans){
                ans=count;
            }
        }
        return ans;
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
        int ans=stock(arr);
        System.out.print(ans);
    }
}
