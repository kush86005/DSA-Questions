package Stack;
import java.util.*;
public class Question14 {
    public static int rightsmallest(int n,int[] arr){
        int size=arr.length;
        int ans=size;
        for(int i=n+1;i<size;i++){
            if(arr[i]<arr[n]){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static int leftsmallest(int n,int[] arr){
        int size=arr.length;
        int ans=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<arr[n]){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static int histogram(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int val1=rightsmallest(i,arr);
            int val2=leftsmallest(i,arr);
            int breadth=(val1-val2-1);
            max=Math.max(max,breadth*arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=histogram(arr);
        System.out.print("Largest Rectangle Area:- "+ans);
    }
}
