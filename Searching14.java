import java.util.*;

public class Searching14{
    public static int[] ProductPuzzle(int[] arr){

        int n=arr.length;

        int[] sol=new int[n];

        sol[0]=1;
        for(int i=1;i<n;i++){
            sol[i]=sol[i-1]*arr[i-1];
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            sol[i]=sol[i]*suffix;
            suffix=suffix*arr[i];
        }
        return sol;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int[] ans=ProductPuzzle(num);
        System.out.print(Arrays.toString(ans));
    }
}
