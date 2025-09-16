package DSAFinal;
import java.util.*;
public class Question041 {
    public static int coins(int n){
        int k=1;
        int count=n;
        int ans=0;
        while(count>=k){
            count=count-k;
            ans++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=coins(n);
        System.out.print(ans);
    }

}
