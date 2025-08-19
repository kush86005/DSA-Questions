package DSASheet;
import java.util.*;
public class Question9 {
    public static int[] TopKFrequent(int[] arr,int k){
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int nums:arr){
            digit.put(nums,digit.getOrDefault(nums,0)+1);
        }
        List<Integer>[] bucket=new List[arr.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:digit.entrySet()){
            int frequency=entry.getValue();
            bucket[frequency].add(entry.getKey());
        }
        int[] result=new int[k];
        int count=0;
        for(int i=bucket.length-1;i>=0&&count<k;i--){
            for(int nums:bucket[i]){
                result[count++]=nums;
                if(count==k) break;
            }
        }
        return result;
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
        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        int[] ans=TopKFrequent(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
