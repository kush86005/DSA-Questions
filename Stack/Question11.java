package Stack;
import java.util.*;
public class Question11 {
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<int[]> stack=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int span=1;

            while(!stack.isEmpty()&&stack.peek()[0]<=arr[i]){
                span+=stack.pop()[1];
            }
            stack.push(new int[]{arr[i],span});
            ans.add(span);
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
        ArrayList<Integer> ans=calculateSpan(arr);
        System.out.print(ans);
    }
}
