package DSASheet;
import java.util.*;
public class Question14 {
    public static int Majority(int[] arr){
        int n=arr.length;
        int element=arr[0];
        int count=1;

        for(int i=1;i<n;i++){
            if(element==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                element=arr[i];
                count=1;
            }
        }
        return element;
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
        int ans=Majority(arr);
        System.out.print(ans);
    }
}

//We consider in this that the majority element always exists. if its not given in the question then we have to verify later after the for loop in function.