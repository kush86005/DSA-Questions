package GoogleLeetcode;
import java.util.*;
public class Question12 {
    public static int[][] flip(int[][] image){
        int n=image.length;    //rows length;
        for(int i=0;i<n;i++){
            int left=0;
            int right=image[i].length-1;
            while(left<=right){
                int temp=image[i][left]^1;
                image[i][left]=image[i][right]^1;
                image[i][right]=temp;
                left++;
                right--;
            }
        }
        return image;
    }
    public static void main(String[] args){
        System.out.print("Enter length:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        flip(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
