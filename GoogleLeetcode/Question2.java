package GoogleLeetcode;
import java.util.*;
public class Question2 {
    public static int[] concatination(int[] nums){
        int n=nums.length;
        int[] ans=new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[j++]=nums[i];
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
        int[] answer=concatination(ans);
        for(int i=0;i<answer.length;i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
