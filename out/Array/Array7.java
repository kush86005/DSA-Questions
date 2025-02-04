import java.util.*;

public class Array7 {
    public static void main(String[] args){

        System.out.print("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<3){
            System.out.print("Invalid Input");
            return;
        }

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values:- ");
            }
            number[i]=sc.nextInt();
        }

        int FirstLargest= Integer.MIN_VALUE;
        int SecondLargest= Integer.MIN_VALUE;
        int ThirdLargest= Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
        if(FirstLargest<number[i]){
            ThirdLargest=SecondLargest;
            SecondLargest=FirstLargest;
            FirstLargest=number[i];
        }else if(SecondLargest<number[i]){
            ThirdLargest=SecondLargest;
            SecondLargest=number[i];
        }else if(ThirdLargest<number[i]){
            ThirdLargest=number[i];
            }
        }
        System.out.print("The Third Largest number is:- "+ThirdLargest);
    }
}
