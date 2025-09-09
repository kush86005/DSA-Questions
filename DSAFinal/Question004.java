package DSAFinal;
import java.util.*;
public class Question004 {
    public static ArrayList<Integer> dup(int[] arr){
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int count:arr){
            digit.put(count,digit.getOrDefault(count,0)+1);
            if(digit.get(count)>1){
                ans.add(count);
            }
        }
        return ans;
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
        ArrayList<Integer> ans=dup(arr);
        System.out.print(ans);
    }
}
