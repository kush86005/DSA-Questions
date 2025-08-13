package Top200;
import java.util.*;
public class Question29 {
    public static int Pair(int[] arr, int n){

        HashMap<Integer, Integer> digit=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            int contain=n-value;
            if(digit.containsKey(contain)){
                int ans1=digit.get(contain);
                int ans2= digit.get(value);
                while(ans1>0&&ans2>0){
                    count++;
                    ans1--;
                    ans2--;
                }
                digit.remove(contain);
                digit.remove(value);
            }
        }
        return count;
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
        System.out.print("Enter n:- ");
        int n=sc.nextInt();

        int ans=Pair(arr,n);
        System.out.print(ans);
    }
}
