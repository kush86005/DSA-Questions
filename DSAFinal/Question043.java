package DSAFinal;
import java.util.*;
public class Question043 {
    public static int sqrt(int x){
        if(x==0) return 0;
        int low=1;
        int high=x;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=sqrt(n);
        System.out.print(ans);
    }
}
