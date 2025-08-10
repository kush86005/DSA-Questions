package Top200;
import java.util.*;

public class Question12 {
    public static int Fib(int n){

        int ans=0;
        int[] array=new int[n+1];
        if(n==1||n==2){
            ans=1;
        }else{
            array[1]=array[2]=1;

            for(int i=3;i<=n;i++){
                array[i]=array[i-1]+array[i-2];
            }
            ans=array[n];
        }
        return ans;
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=Fib(n);
        System.out.print(ans);
    }
}
