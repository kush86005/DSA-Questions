package GoogleLeetcode;
import java.util.*;
public class Question3 {
    public static int[] buildArray(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
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
        int[] arr=buildArray(ans);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
