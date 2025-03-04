import java.util.*;

public class Array29 {
   public static int max(int a,int b){
        int diff=b-a;
        return diff;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int k=number[0];

        for(int i=1;i<size;i++){
            if(number[i]<k){
                k=number[i];
            }
            if(k==number[size-1]){
                System.out.print("No profit possible");
                return;
            }
        }
        int m=Integer.MIN_VALUE;
        for(int i=size-1;i>k;i--){
            if(number[i]>m){
                m=number[i];
            }
        }
        System.out.println("Best time to buy the stock:- "+k);
        System.out.println("Best time to sell the stock:- "+m);
        System.out.print("Maximum profit:- "+max(k,m));
    }
}
