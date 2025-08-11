package Top200;
import java.util.*;
public class Question20 {
    public static boolean Fib(int n){

        double[] arr=new double[n*n];

        arr[0]=arr[1]=1;
        boolean isTrue=false;

        for(int k=2;k< arr.length;k++){
            arr[k]=arr[k-1]+arr[k-2];
            if(arr[k]==n){
                isTrue=true;
                break;
            }else if(arr[k]>n){
                break;
            }else{
                continue;
            }
        }
        return isTrue;
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean ans=Fib(n);
        System.out.print(ans);
    }
}
