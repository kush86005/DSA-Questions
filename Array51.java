import java.util.*;

public class Array51 {
    public static void Rotation(int k, int[] arr){

        int n=arr.length;

        k=k%n;

        for(int i=0;i<k;i++){
            int last=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("Enter K:- ");
        int k=sc.nextInt();

        Rotation(k,num);
    }
}
