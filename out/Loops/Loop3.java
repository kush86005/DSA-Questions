import java.util.*;

public class Loop3 {
    public static void main(String[] args){

        int i,n;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:- ");
        n=sc.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
