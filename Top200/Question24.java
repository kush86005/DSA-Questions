package Top200;
import java.util.*;
public class Question24 {
    public static void Unique(int[] arr){

        int size=arr.length;

        HashMap<Integer,Integer> digits=new HashMap<>();

        for(int i=0;i<size;i++){
            digits.put(arr[i],digits.getOrDefault(arr[i],0)+1);
        }

        for(int key: digits.keySet()){
            if(digits.get(key)==1){
                System.out.print("Unique element:- "+key);
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Unique(arr);
    }
}