package DSAFinal;
import java.util.*;
public class Question044 {
    public static int search(int[] arr,int target){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]!=target&&arr[j]!=target){
                i++;
                j--;
            }else if(arr[i]==target){
                return i;
            }else if(arr[j]==target){
                return j;
            }
        }
        return -1;
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
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        System.out.print(search(arr,target));
    }
}
