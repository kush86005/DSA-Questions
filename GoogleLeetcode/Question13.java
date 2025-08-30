package GoogleLeetcode;
import java.util.*;
public class Question13 {
    public static List<Integer> val(int[] nums,int target){
        int n=nums.length;
        int small=0;
        int equal=0;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                small++;
            }else if(nums[i]==target){
                equal++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<equal;i++){
            ans.add(small+i);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("Enter target:- ");
        int target=sc.nextInt();
        List<Integer> ans=val(num,target);
        System.out.print(ans);
    }
}
