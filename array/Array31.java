package array;

import java.util.*;

public class Array31 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] num1=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num1[i]=sc.nextInt();
        }

        System.out.print("Enter size:- ");
        int size2=sc.nextInt();

        int[] num2=new int[size2];

        System.out.print("Enter values:- ");
        for(int i=0;i<size2;i++){
            num2[i]=sc.nextInt();
        }

        System.out.print("Enter size:- ");
        int size3=sc.nextInt();

        int num3[]=new int[size3];

        System.out.print("Enter values:- ");
        for(int i=0;i<size3;i++){
            num3[i]=sc.nextInt();
        }

        int i=0;
        int j=0;
        int k=0;

        ArrayList<Integer> common=new ArrayList<>();

        while (i<size&&j<size2&&k<size3){
            if(num1[i]==num2[j]&&num2[j]==num3[k]){
                common.add(num1[i]);
                i++;
                j++;
                k++;
                continue;
            } else if (num1[i]<num3[k]) {
                i++;
            }else if(num2[j]<num3[k]){
                j++;
            }else{
                k++;
            }
        }
        if(common.isEmpty()){
            System.out.print("No common elements found");
        }else{
            System.out.print("Comman elements are:- "+common);
        }
    }
}
