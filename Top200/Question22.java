package Top200;
import java.util.*;
public class Question22 {
    public static void Finding(int[] arr,int n){

        int i=arr.length;

        for(int k=0;k<i;k++){
            if(arr[k]==n){
                System.out.print("Number present at index:- "+k);
                break;
            }
            if(k==i-1){
                System.out.print(-1);
                break;
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        int[] arr=new int[i];
        System.out.print("Enter elements:- ");
        for(int k=0;k<i;k++){
            arr[k]=sc.nextInt();
        }

        System.out.print("Enter number to find:- ");
        int f=sc.nextInt();

        Finding(arr,f);
    }
}
