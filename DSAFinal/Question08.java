package DSAFinal;
import java.util.*;
public class Question08 {
    public static int majority(int[] arr){
        int n=arr.length;
        int candidate=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(candidate==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate=arr[i];
                count=1;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=majority(arr);
        System.out.print(ans);
    }
}
