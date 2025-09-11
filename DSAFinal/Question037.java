package DSAFinal;
import java.util.*;
public class Question037 {
    public static ArrayList<Integer> next(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int current=arr[i];
            while(!stack.isEmpty()&&stack.peek()<=current){
                stack.pop();
            }
            if(stack.isEmpty()){
                result.add(-1);
            }else{
                result.add(stack.peek());
            }
            stack.push(current);
        }
        Collections.reverse(result);
        return result;
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
        ArrayList<Integer> result=next(arr);
        System.out.print(result);
    }
}
