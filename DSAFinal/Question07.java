package DSAFinal;
import java.util.*;
public class Question07 {
    public static int majority(int[] arr){
        int n=arr.length;
        int ans=n/2;
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int count:arr){
            digit.put(count,digit.getOrDefault(count,0)+1);
        }
        for(Map.Entry<Integer,Integer> enter:digit.entrySet()){
            if(enter.getValue()>ans){
                return enter.getKey();
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
        System.out.print(majority(arr));
    }
}
