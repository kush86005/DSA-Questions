package Stack;
import java.util.*;
public class Question12 {
    public static int[] helpclassmate(int arr[]) {
        int n=arr.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=arr[stack.peek()];
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
        int[] ans=helpclassmate(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
