package Stack;
import java.util.*;
//Monotonic Stack:- A monotonic stack is a stack that keeps its elements in a sorted order —either increasing or decreasing.
//A monotonic increasing stack means the values inside the stack always go up (each new element is greater than the one before it).
//A monotonic decreasing stack means the values always go down.
public class Question10 {
    public static int[] monotonicStack(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[arr.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]){
                int index=stack.pop();
                ans[index]=arr[i];
            }
            stack.push(i);
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
        int[] ans=monotonicStack(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
