package Stack;
import java.util.*;
public class Question05 {
    public static int[] Consecutive(int[] arr){
        Stack<Integer> str=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(str.isEmpty()){
                str.push(arr[i]);
            }else{
                if(str.peek()==arr[i]&&!str.isEmpty()){
                    while(i<n&&str.peek()==arr[i]){
                        i++;
                    }
                    str.pop();
                    i--;
                }else{
                    str.push(arr[i]);
                }
            }
        }
        int[] ans=new int[str.size()];
        int k=ans.length;
        for(int i=k-1;i>=0;i--){
            int val=str.pop();
            ans[i]=val;
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
        int[] ans=Consecutive(arr);
        int k=ans.length;
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
