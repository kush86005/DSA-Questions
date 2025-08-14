package Top200;
import java.util.*;
public class Question35 {
    public static void Sort(int[] arr, int[] array){
        int s=arr.length;
        int n= array.length;
        ArrayList<Integer> New=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<s&&j<n){
            if(arr[i]>array[j]){
                New.add(array[j]);
                j++;
            }else if(arr[i]<array[j]){
                New.add(arr[i]);
                i++;
            }else{
                New.add(arr[i]);
                New.add(array[j]);
                i++;
                j++;
            }
        }
        if(i<s){
            while(i<s){
                New.add(arr[i]);
                i++;
            }
        }else{
            while(j<n){
                New.add(array[j]);
                j++;
            }
        }
        System.out.print("Merged array:- "+New);
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter size:- ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        Sort(arr,array);
    }
}
