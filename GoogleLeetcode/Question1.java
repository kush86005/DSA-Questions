package GoogleLeetcode;
import java.util.*;
public class Question1 {
    public static int addtwonum(int a,int b){
        int ans=a+b;
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter num1:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter num2:- ");
        int m=sc.nextInt();

        int ans=addtwonum(n,m);
        System.out.print(ans);
    }
}
