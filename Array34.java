import java.util.*;

public class Array34 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.print("Enter k:- ");
        int k=sc.nextInt();


        int count=0;
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum=sum+number[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.print("Output:- "+count);
    }
}