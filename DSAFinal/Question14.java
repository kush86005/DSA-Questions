package DSAFinal;
import java.util.*;
public class Question14 {
    public static int sum(int[] arr,int k){
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> digit=new HashMap<>();
        digit.put(0,1);

        for(int num:arr){
            sum+=num;
            if(digit.containsKey(sum-k)){
                ans+=digit.get(sum-k);
            }
            digit.put(sum,digit.getOrDefault(sum,0)+1);
        }
        return ans;
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
        System.out.print("Enter K:- ");
        int k=sc.nextInt();

        int ans=sum(arr,k);
        System.out.print(ans);
    }
}
