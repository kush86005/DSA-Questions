package DSASheet;
import java.util.*;
public class Question4 {
    public static ArrayList<Integer> ContainsDup(int[] arr){
        int s=arr.length;
        ArrayList<Integer> New=new ArrayList<>();
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int i=0;i<s;i++){
            digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);

            if(digit.get(arr[i])>1){
                New.add(arr[i]);
            }
        }
        return New;
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
        ArrayList<Integer> Ans=ContainsDup(arr);
        System.out.print(Ans);
    }
}
