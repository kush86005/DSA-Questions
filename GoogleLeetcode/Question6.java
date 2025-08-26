package GoogleLeetcode;
import java.util.*;
public class Question6 {
    public static int[] smallNumber(int[] nums){
        int n=nums.length;
        int[] sorted=nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!digit.containsKey(sorted[i])){
                digit.put(sorted[i],i);
            }
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=digit.get(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ans=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            ans[i]=sc.nextInt();
        }
        int[] arr=smallNumber(ans);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
