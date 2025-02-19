import java.util.*;

public class Array15 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];
        boolean hasNegative=false;

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            if(number[i]<0){
                hasNegative=true;
            }
        }

        if(!hasNegative){
            System.out.print("No negative value found");
            return;
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

        System.out.print("Sorted Array:- ");
        for(int i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }
    }
}
