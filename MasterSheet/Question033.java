package MasterSheet;
import java.util.*;
public class Question033 {
    public static int minimum(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[j]<arr[mid]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return arr[i];
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,6,0,1,2,3,4};
        System.out.print(minimum(arr));
    }
}
