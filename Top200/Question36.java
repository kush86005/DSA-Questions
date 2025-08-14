package Top200;
import java.util.*;
public class Question36 {
    public static void Shifting(int[] arr, int target){
        int s=arr.length;
        int z=-1;
        for(int k=0;k<s;k++){
            if(arr[k]==target){
                z=k;
                break;
            }
        }
        if(z==-1){
            System.out.print("Invalid input");
            return;
        }
        int i=0;
        while(i<=z){
            int temp=arr[0];
            for(int j=1;j<s;j++){
                arr[j-1]=arr[j];
            }
            arr[s-1]=temp;
            i++;
        }
        for(int q=0;q<s;q++){
            System.out.print(arr[q]+" ");
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
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        Shifting(arr,target);
    }
}
