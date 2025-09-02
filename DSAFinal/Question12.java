package DSAFinal;
import java.util.*;
public class Question12 {
    public static int[] frequent(int[] arr,int k){
        int n=arr.length;
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int count:arr){
            digit.put(count,digit.getOrDefault(count,0)+1);
        }
        List<Integer>[] ans=new List[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> enter:digit.entrySet()){
            ans[enter.getValue()].add(enter.getKey());
        }
        int[] values=new int[k];
        int j=0;
        int q=ans.length;
            for (int i = q - 1; i >= 0&&j<k; i--) {
                for(int num:ans[i]){
                    values[j++]=num;
                    if(j==k){
                        break;
                    }
                }
            }
        return values;
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

        int[] ans=frequent(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
