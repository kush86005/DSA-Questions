package Top200;
import java.util.*;
public class Question15 {
    public static void PrintingSeq(int n){

        int j=1;
        for(int i=1;i<=n;i++){
            int num=3*j+2;
            if(num%4!=0){
                System.out.print(num+" ");
            }else{
                i--;
            }
            j++;
        }
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        PrintingSeq(n);
    }
}
