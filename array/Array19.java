package array;

import java.util.*;

public class Array19{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        int maxnum=0;
        int currentnum=0;

        for(int i=0;i<size;i++){
            currentnum=currentnum+number[i];

            if(maxnum<currentnum) {
                maxnum = currentnum;
            }

                if (currentnum < 0) {
                    currentnum = 0;
                }
            }
        System.out.print("The sum is:- "+maxnum);
        }
    }

