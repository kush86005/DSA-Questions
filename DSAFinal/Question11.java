package DSAFinal;
import java.util.*;
public class Question11 {
    public static ArrayList<Integer> product(int[] arr,int k){
        int n=arr.length;
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int count:arr){
            digit.put(count,digit.getOrDefault(count,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap=new PriorityQueue<>((a,b)->{if(a.getValue()!=b.getValue()) {
            return b.getValue() - a.getValue();
        }else{
           return a.getValue()-b.getValue();
        }
        });
        maxheap.addAll(digit.entrySet());
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(maxheap.poll().getKey());
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

        ArrayList<Integer> ans=product(arr,k);
        System.out.print(ans);
    }
}
