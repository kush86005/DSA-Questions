package DSASheet;
import java.util.*;
public class Question1 {
    public static int[] TwoSum(int[] arr,int target){
        int s=arr.length;
        HashMap<Integer,Integer> digit=new HashMap<>();
        int[] answer=new int[2];
        for(int i=0;i<s;i++){
            int ans=target-arr[i];

            if(digit.containsKey(ans)){
                answer[0]=i;
                answer[1]=digit.get(ans);
            }
            digit.put(arr[i],i);
        }
        return null;
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

        int[] result=TwoSum(arr,target);

        if(result!=null) {
            System.out.print("[" + result[0] + " " + result[1] + "]");
        }else{
            System.out.print("No Pair found");
        }
    }
}
