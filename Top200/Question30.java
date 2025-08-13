package Top200;
import java.util.*;
public class Question30 {
    public static void Print(int[] arr){

        int s=arr.length;
        int count0=0;

        for(int i=0;i<s;i++){
            if(arr[i]==0){
                count0++;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<s;i++){
            arr[i]=1;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        Print(arr);

        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
