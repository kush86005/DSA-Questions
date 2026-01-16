package MasterSheet;
import java.util.*;
public class Question022 {
    public static int[] temp(int[] arr){
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{73,74,75,71,69,72,76,73};
        int[] ans=temp(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
