package Top200;
import java.util.*;
public class Question17 {
    public static double Binary(int n){

        double ans=0;
        double i=0;
        while(n>0){
            int num=n%10;
            double val=num*Math.pow(2,i);
            i++;
            ans+=val;
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double ans=Binary(n);
        System.out.print(ans);
    }
}
