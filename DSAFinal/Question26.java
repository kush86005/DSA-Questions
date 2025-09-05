package DSAFinal;
import java.util.*;
public class Question26 {
    public static int container(int[] arr){
        int i=0;
        int j=arr.length-1;
        int ans=0;
        int area=0;
        while(i<j){
            if(arr[i]<arr[j]){
                ans=arr[i]*(j-i);
                i++;
            }else{
                ans=arr[j]*(j-i);
                j--;
            }
            area=Math.max(area,ans);
        }
        return area;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ans=new int[n];
        System.out.print("Enter element:- ");
        for(int i=0;i<n;i++){
            ans[i]=sc.nextInt();
        }
        int answer=container(ans);
        System.out.print(answer);
    }
}
