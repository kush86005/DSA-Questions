import java.util.*;

public class Searching7 {
    public static int Search(int[] arr, int x, int k){
        int n=arr.length;

        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        if(ans==Integer.MIN_VALUE){
            ans=-1;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("Enter x:- ");
        int x=sc.nextInt();

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int ans=Search(num,x,k);
        System.out.print(ans);
    }
}
