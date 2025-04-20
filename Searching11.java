import java.util.*;

public class Searching11 {
    public static int FindSubarray(int[] arr) {

        int n = arr.length;
        int countsum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            countsum = arr[i];
            if(countsum==0){
                ans++;
            }
            for (int j = i + 1; j < n; j++) {
                countsum += arr[j];
                if (countsum == 0) {
                    ans++;
                }
            }
        }
        return ans;
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
        int ans=FindSubarray(num);
        System.out.print(ans);
    }
}