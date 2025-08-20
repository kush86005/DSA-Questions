package DSASheet;
import java.util.*;
public class Question12 {
    public static int LongestConsecutive(int[] arr){
        HashSet<Integer> digit=new HashSet<>();
        for(int num:arr){
            digit.add(num);
        }
        int totalMax=0;
        for(int i:digit){
            if(!digit.contains(i-1)){
                int ans=i;
                int count=1;

                while(digit.contains(ans+1)){
                    ans++;
                    count++;
                }
                totalMax=Math.max(totalMax,count);
            }
        }
        return totalMax;
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
        int ans=LongestConsecutive(arr);
        System.out.print(ans);
    }
}
