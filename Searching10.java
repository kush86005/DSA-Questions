import java.util.*;

public class Searching10 {
    public static int Triplet(long[] arr,int sum){
        int n=arr.length;

        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-2;i++){

            int left=i+1;
            int right=n-1;

            while(left<right){

                long currentsum=arr[i]+arr[left]+arr[right];
                if(currentsum<sum){
                    count+=right-left;
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long[] arr=new long[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter sum:- ");
        int x= sc.nextInt();

        long ans=Triplet(arr,x);
        System.out.print(ans);
    }
}

}
