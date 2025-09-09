package DSAFinal;
import java.util.*;
public class Question003 {
    public static boolean dup(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int count:arr){
            digit.put(count,digit.getOrDefault(count,0)+1);
            if(digit.get(count)>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(dup(arr));
    }
}
