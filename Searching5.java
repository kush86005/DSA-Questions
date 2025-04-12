import java.util.*;

public class Searching5 {
    public static int Middle(int a, int b, int c){
        if((a>b&&a<c)||(a<b&&a>c)){
            return a;
        }else if((b>a&&b<c)||(b<a&&b>c)){
            return b;
        }else{
            return c;
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

        int result=Middle(a,b,c);
        System.out.print("Middle number:- "+result);
    }
}
