package Recursion;
import java.util.*;
public class Question14 {
    public static boolean find(int[] arr,int ind,int x){
        if(ind==arr.length){
            return false;
        }
        if(arr[ind]==x){
            return true;
        }
        return find(arr,ind+1,x);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter x:- ");
        int x=sc.nextInt();
        boolean istrue=find(arr,0,x);
        System.out.print(istrue);
    }
}
