package GoogleLeetcode;
import java.util.*;
public class Question7 {
    public static int[] decompress(int[] nums){
        int n=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i+=2){
            int val=nums[i];
            for(int j=0;j<val;j++){
                ans.add(nums[i+1]);
            }
        }
        int q=ans.size();
        int[] got=new int[q];
        for(int i=0;i<q;i++){
            got[i]=ans.get(i);
        }
        return got;
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
        int[] val=decompress(ans);
        for(int i=0;i<val.length;i++){
            System.out.print(val[i]+" ");
        }
    }
}
