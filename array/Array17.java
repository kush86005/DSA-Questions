package array;

import java.util.*;

public class Array17{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter Values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        int maxsum= Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++) {
                sum += number[j];

                if (maxsum < sum) {
                    maxsum = sum;

                }
            }
        }
        System.out.println("The largest sum contiguous subarray:- "+maxsum);
        }
    }

