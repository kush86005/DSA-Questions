package Top200;
import java.util.*;
public class Question27 {
    public static void Intersection(int[] arr, int[] array){

        int s=arr.length;
        int size=array.length;

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<size;i++){
            set.add(array[i]);
        }
        for(int i=0;i<s;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
                set.remove(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter size of 1st:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter size of 2nd:- ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.print("Enter elements:- ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        Intersection(arr,array);
    }
}
