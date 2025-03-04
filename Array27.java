import java.util.*;

public class Array27{
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        if(size==0){
            return;
        }

        int[] number=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++) {
            number[i] = sc.nextInt();
        }

        int num= number.length;;
        int k=num-2;

        for(int i=num-1;i>0;i--){
            if(number[k]>=number[i]){
                k--;
            }else{
                break;
            }
        }
        if(k==-1){
            reverse(number,0,num-1);
            return;
        }

        for(int i=num-1;i>0;i--){
            if(number[i]>number[k]){
                int temp=number[k];
                number[k]=number[i];
                number[i]=temp;
                break;
            }
        }
        reverse(number,k+1,num-1);

        System.out.print("Next Permutation:- ");
        for(int i=0;i<size;i++){
            System.out.print("["+number[i]+","+"]");
        }
    }
}