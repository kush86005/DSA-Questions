package Stack;
import java.util.*;
public class Question09 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(stack.isEmpty()||asteroids[i]>0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty()){
                    int top=stack.peek();
                    if(top<0){
                        stack.push(asteroids[i]);
                        break;
                    }
                    int val=Math.abs(asteroids[i]);
                    if(val==top){
                        stack.pop();
                        break;
                    }else if(val<top){
                        break;
                    }else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int n=stack.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
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
        int[] ans=asteroidCollision(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
