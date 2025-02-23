import java.util.*;

public class Array20 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter Values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        int maxnum=Integer.MIN_VALUE;
        int currentnum=0;

        for(int i=0;i<size;i++){
            currentnum=currentnum+number[i];

            if(currentnum>maxnum){
                maxnum=currentnum;
            }
            if(currentnum<0){
                currentnum=0;
            }
        }
        System.out.print("The largest sum contiguous subarray is:- "+maxnum);
    }
}
