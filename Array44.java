import java.util.*;

public class Array44 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int num[]=new int[size];

        System.out.print("Enter value:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter a:- ");
        int a=sc.nextInt();
        System.out.print("Enter b:- ");
        int b=sc.nextInt();

        int k=0;
        int m=size-1;

        while(k<=m){
            if(num[k]<a){
                k++;
            }else if(num[k]>b){
                int temp=num[m];
                num[m]=num[k];
                num[k]=temp;
                m--;
            }else{
                k++;
            }
        }
        System.out.print("Ans is:- "+Arrays.toString(num));
    }
}