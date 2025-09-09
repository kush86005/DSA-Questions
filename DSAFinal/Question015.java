package DSAFinal;
import java.util.*;
public class Question015 {
    public static int sequence(int[] arr){
        Map<Integer,Integer> digit=new TreeMap<>();
        int n=arr.length;
        for(int num:arr){
            digit.put(num,digit.getOrDefault(num,0)+1);
        }
        int k=0;
        for(Map.Entry<Integer,Integer> enter:digit.entrySet()){
            int element=enter.getKey();
            arr[k++]=element;
        }
        int i=0;
        int count=1;
        int ans=0;
        while(i<n-1){
            if(arr[i+1]-arr[i]==1){
                count++;
                i++;
                ans=Math.max(ans,count);
            }else{
                count=1;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=sequence(arr);
        System.out.print(ans);
    }
}
