package DSASheet;
import java.util.*;
public class Question3 {
    public static boolean ContainsDup(int[] arr){
        int s=arr.length;
        boolean isTrue=false;
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int i=0;i<s;i++){
            digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);

            if(digit.get(arr[i])>1){
                isTrue=true;
                break;
            }
        }
        return isTrue;
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
        boolean ans=ContainsDup(arr);
        System.out.print(ans);
    }
}
