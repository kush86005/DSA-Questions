package DSAFinal;
import java.util.*;
public class Question28 {
    public static int close(int[] arr,int target){
        int n=arr.length;
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        int closest=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                int count=Math.abs(target-sum);
                if(count<mindiff||(count==mindiff&&sum>closest)){
                    closest=sum;
                    mindiff=count;
                }
                if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return closest;
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
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        int ans=close(arr,target);
        System.out.print(ans);
    }
}
