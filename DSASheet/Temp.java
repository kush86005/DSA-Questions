package DSASheet;
import java.util.*;
public class Temp {
    public static int[] twosum(int[] arr,int target){
        HashMap<Integer,Integer> digit=new HashMap<>();
        int[] result=new int[2];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int tag=target-arr[i];

            if(digit.containsKey(tag)){
                result[0]=i;
                result[1]=digit.get(tag);
                break;
            }
            digit.put(arr[i],i);
        }
        return result;
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

        int[] result=twosum(arr,target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
