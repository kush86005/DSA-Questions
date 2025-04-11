import java.lang.reflect.Field;
import java.util.*;

public class Searching2 {
    public static ArrayList<Integer> IndexValue(int[] arr){

        int n=arr.length;

        ArrayList<Integer> Final=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                Final.add(arr[i]);
            }
        }
        return Final;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        ArrayList<Integer> result= IndexValue(num);
        System.out.print(result);
    }
}
