package DSAFinal;
import java.util.*;
public class Question1 {
    public static int[] twoSum(int[] arr,int target){
        int n=arr.length;
        int[] res=new int[2];
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int i=0;i<n;i++){
            int ans=target-arr[i];

            if(digit.containsKey(ans)){
                res[0]=i;
                res[1]=digit.get(ans);
                break;
            }
            digit.put(arr[i],i);
        }
        return res;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elemnets:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        int[] ans=twoSum(arr,target);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
