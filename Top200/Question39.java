package Top200;
import java.util.*;
public class Question39 {
    public static int Increasing(int[] arr){
        int s=arr.length;
        int ans=0;
        for(int i=1;i<s;i++){
            if(arr[i]<arr[i-1]){
                ans=i;
                break;
            }
        }
        return ans;
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
        int ans=Increasing(arr);
        System.out.print(ans);
    }
}
