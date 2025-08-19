package DSASheet;
import java.util.*;
public class Question10 {
    public static ArrayList<Integer> topKFrequent(int[] arr,int k){
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int nums:arr){
            digit.put(nums,digit.getOrDefault(nums,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> MaxHeap=new PriorityQueue<>((a,b)->{if(a.getValue()!=b.getValue()){
            return b.getValue()-a.getValue();
        }else{
            return b.getKey()-a.getKey();
        }});
        MaxHeap.addAll(digit.entrySet());
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            result.add(MaxHeap.poll().getKey());
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

        ArrayList<Integer> result=topKFrequent(arr,k);
        System.out.print(result);
    }
}
