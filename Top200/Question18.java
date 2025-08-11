package Top200;
import java.util.*;
public class Question18 {
    public static void Integral(int n){

        int Output=0;
        while(Output*Output<=n){
            Output++;
        }
        Output--;
        System.out.print(Output);
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Integral(n);
    }
}
