package Stack;
import java.util.*;
public class Question13 {
    public static int[] nextgreater(int[] arr){
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=stack.peek();
                }
            }
            stack.push(arr[i%n]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=nextgreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
