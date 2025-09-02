package DSAFinal;
import java.util.*;
public class Question16 {
    public static int Longest(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int total=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int count=1;
                int ans=num;
                while(set.contains(ans+1)){
                    count++;
                    ans++;
                }
                total=Math.max(total,count);
            }
        }
        return total;
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
        int ans=Longest(arr);
        System.out.print(ans);
    }
}
