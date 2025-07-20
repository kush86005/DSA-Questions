package searching;

import java.util.*;

public class Searching19 {
    public static int inSequence(int a,int b,int c){

        int ans=Integer.MIN_VALUE;
        if(c==0){
            if(a==b) {
                return 1;
            }else if(a!=b){
                return 0;
            }
        }

        if((b-a)%c==0&&(b-a)/c>=0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter a:- ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.print("Enter b:- ");
        int b=sc.nextInt();

        System.out.print("Enter c:- ");
        int c=sc.nextInt();

        int ans=inSequence(a,b,c);
        System.out.print(ans);
    }
}
