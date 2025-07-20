package array;

import java.util.*;

public class Array23 {
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] number = new int[size+1];

        System.out.print("Enter values:- ");
        for (int i = 0; i<size+1; i++) {
            number[i]=sc.nextInt();
            if(number[i]>size){
                System.out.print("Invalid Input");
                return;
            }
        }

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(number[i]==number[i+1]){
                System.out.print("Duplicate number is "+number[i]+" at index "+i);
            }
        }
    }
}
