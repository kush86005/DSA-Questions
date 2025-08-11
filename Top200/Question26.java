package Top200;
import java.util.*;
public class Question26 {
    public static void Duplicate(int[] arr){

        int size=arr.length;

        HashMap<Integer,Integer> digits=new HashMap<>();

        for(int i=0;i<size;i++){
            digits.put(arr[i],digits.getOrDefault(arr[i],0)+1);
        }
        for(int key:digits.keySet()){
            if(digits.get(key)==2){
                System.out.print(key);
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Duplicate(arr);
    }
}
