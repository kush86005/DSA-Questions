package Top200;
import java.util.*;
public class Question14 {
    public static int Calculate(int n, int c){

        int ans=0;
        int mul=1;
        int sum=0;
        if(c==1){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            ans=sum;
        }else if(c==2){
            for(int j=1;j<=n;j++){
                mul*=j;
            }
            ans=mul;
        }else{
            System.out.println("Invalid input");
        }
        return ans;
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter C:- ");
        int c=sc.nextInt();

        int ans=Calculate(n,c);
        System.out.print(ans);
    }
}
