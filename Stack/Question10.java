package Stack;
import java.util.*;
//Monotonic Stack:- A monotonic stack is a stack that keeps its elements in a sorted order —either increasing or decreasing.
//A monotonic increasing stack means the values inside the stack always go up (each new element is greater than the one before it).
//A monotonic decreasing stack means the values always go down.
public class Question10 {
    public static int[] nextgreater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=nextgreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
