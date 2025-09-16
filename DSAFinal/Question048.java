package DSAFinal;
import java.util.*;
public class Question048 {
    public static int koko(int[] arr,int k){
        int low=1;
        int high=0;
        for(int pile:arr){
            if(pile>high){
                high=pile;
            }
        }
        int result=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=0;
            for(int pile:arr){
                hours+=(pile+mid-1)/mid;
            }
            if(hours<=k){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
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
        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int ans=koko(arr,k);
        System.out.print(ans);
    }
}
