import java.util.*;

public class Searching18 {
    public static int  KthElement(int[] a,int[] b,int k){

        int n=a.length;
        int m=b.length;

        int[] num=new int[n+m];

        int w=0;

        for(int i=0;i<n;i++){
            num[w]=a[i];
            w++;
        }
        for(int i=0;i<m;i++){
            num[w]=b[i];
            w++;
        }

        Arrays.sort(num);

        int ans=num[k-1];

        return ans;
    }
    public static void main(String[] args){

        System.out.print("Enter size of a:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter size of b:- ");
        int m=sc.nextInt();

        int[] a=new int[n];
        System.out.print("Enter values of a:- ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[m];
        System.out.print("Enter values of b:- ");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int ans=KthElement(a,b,k);
        System.out.print("Element at Kth position:- "+ans);
    }
}
