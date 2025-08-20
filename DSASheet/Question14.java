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
        //You can directly return element after this if its given in the question that maximum element is always present.
        count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }

        if (count > n / 2) {
            return element;
        } else {
            return -1; // No majority element
        }
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
