package Recursion;
import java.util.*;
public class Question15 {
    public static ArrayList<Integer> indices(int[] arr,int ind,int x){
        if(ind==arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> res=indices(arr,ind+1,x);
        if(arr[ind]==x){
            res.add(0,ind);
        }
        return res;
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
        ArrayList<Integer> result=indices(arr,0,x);
        System.out.print(result+" ");
    }
}