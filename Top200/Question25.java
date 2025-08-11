package Top200;
import java.util.*;
public class Question25 {
    public static void Repeating(int[] arr){

        int size=arr.length;

        HashMap<Integer, Integer> digits=new HashMap<>();

        for(int i=0;i<size;i++){
            digits.put(arr[i],digits.getOrDefault(arr[i],0)+1);
        }
        int maxkey=-1;
        int maxcount=0;
        for(int key: digits.keySet()){
            int count=(digits.get(key));
            if(count>maxcount){
                maxcount=count;
                maxkey=key;
            }
        }
        System.out.print(maxkey+" was repeated "+maxcount+" times");
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.print("Enter elements:- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Repeating(arr);
    }
}
