package Sorting;
import java.util.*;
public class Question04 {
    public static void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid- l +1;
        int n2= r -mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;

        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,2,9,1,0,7};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
