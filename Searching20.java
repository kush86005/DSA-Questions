import java.util.*;

public class Searching20{
    public static int CountInversion(int[] arr){

        int n=arr.length;

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=CountInversion(arr);
        System.out.print("Count Inversion:- "+ans);
    }
}
