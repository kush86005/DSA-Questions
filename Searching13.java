import java.util.*;

public class Searching13 {
    public static void Productpuzzle(int[] arr){

        int n= arr.length;

        int[] sol=new int[n];
        for(int i=0;i<n;i++){
            int sum=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    sum=sum*arr[j];
                }
            }
            sol[i]=sum;
        }
        System.out.print(Arrays.toString(sol));
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         Productpuzzle(arr);
    }
}
