package array;

import java.util.*;

public class Array32{
    public static void rightrotate(int[] num, int start, int end){
        int temp=num[end];

        for(int i=end;i>start;i--){
            num[i]=num[i-1];
        }
        num[start]=temp;
    }
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            int k=i+1;
            if(i%2==0&&number[i]>=0){
                while (k<size&&number[k]<0){
                    k++;
                }
                if(k<size) {
                    rightrotate(number, i, k);
                }
            }else if(i%2==1&&number[i]<0){
                while (k<size&&number[i]>=0){
                    k++;
                }
                if(k<size){
                    rightrotate(number,i,k );
                }
            }
        }
        System.out.print("Output:- "+Arrays.toString(number));
    }
}