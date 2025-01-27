import java.util.*;

public class Array3 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:- ");
        int size=sc.nextInt();

        int number[]=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values:- ");
            }
                number[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(number[i]==x){
                System.out.print("The index of x is: "+i);
            }
        }
    }
}
