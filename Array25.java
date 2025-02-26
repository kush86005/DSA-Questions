import java.util.*;

public class Array25{
    public static void main(String[] args){

        System.out.print("Enter size for Array1:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        System.out.print("Enter size for Array2:- ");
        int size2=sc.nextInt();

        int[] num=new int[size2];

        System.out.print("Enter valies:- ");
        for(int i=0;i<size2;i++){
            num[i]=sc.nextInt();
        }

        int left=size-1;
        int right=0;

        while (left>=0 && right<size2){
            if(number[left]>num[right]){
                int temp=number[left];
                number[left]=num[right];
                num[right]=temp;
            }
            left--;
            right++;
        }

        Arrays.sort(number);
        Arrays.sort(num);

        System.out.print("A1:- ");
        for(int i=0;i<size;i++){
            System.out.print(+number[i]+" ");
        }
        System.out.println();

        System.out.print("A2:- ");
        for(int i=0;i<size2;i++){
            System.out.print(+num[i]+" ");
        }
    }
}