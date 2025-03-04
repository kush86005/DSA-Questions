import java.util.*;

public class Array28 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        int count=0;

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                    count++;
                }
            }
        }
        System.out.println("Count inversion:- "+count);
    }
}
