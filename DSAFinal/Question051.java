package DSAFinal;
import java.util.*;
public class Question051 {
    public static double median(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int[] arr=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }else{
                arr[k++]=b[j++];
            }
        }
        while(i<n){
            arr[k++]=a[i++];
        }
        while(j<m){
            arr[k++]=b[j++];
        }
        int p=arr.length;
        double ans=0;
        if(p%2==0){
            ans=(arr[p/2-1]+arr[p/2])/2.0;
        }else{
            ans=arr[p/2];
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter size:- ");
        int m=sc.nextInt();
        int[] b=new int[m];
        System.out.print("Enter elements:- ");
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        double ans=median(a,b);
        System.out.print(ans);
    }
}
