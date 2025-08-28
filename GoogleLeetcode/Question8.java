package GoogleLeetcode;
import java.util.*;
public class Question8 {
    public static int[] decompress(int[] nums){
        int n=nums.length;
        int size=0;
        for(int i=0;i<n;i+=2){
            size+=nums[i];
        }
        int[] ans=new int[size];
        int k=0;
        for(int i=0;i<n;i+=2){
            int val=nums[i];
            for(int j=0;j<val;j++){
                ans[k++]=nums[i+1];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] val=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        int[] ans=decompress(val);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
