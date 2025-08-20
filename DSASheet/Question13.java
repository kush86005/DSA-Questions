package DSASheet;
import java.util.*;
public class Question13 {
    public static int MajorityElement(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> digit=new HashMap<>();
        for(int num:arr){
            digit.put(num,digit.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> enter:digit.entrySet()){
            int freq=enter.getValue();
            if(freq>n/2){
                return enter.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] result=new int[n];
        System.out.print("enter elements:- ");
        for(int i=0;i<n;i++){
            result[i]=sc.nextInt();
        }
        int ans=MajorityElement(result);
        System.out.print(ans);
    }
}
