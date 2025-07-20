package searching;

import java.util.*;

public class Searching8 {
    public static boolean Finddiff(int[] arr, int x){
        Set<Integer> Final=new HashSet<>();

        boolean ans=false;
        for(int num:arr){
            if(Final.contains(num-x)||Final.contains(num+x)){
                ans=true;
                break;
            }else{
                Final.add(num);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int[] num=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        System.out.print("Enter x:- ");
        int x= sc.nextInt();

        boolean ans=Finddiff(num,x);
        System.out.print(ans);
    }
}



/* int n=arr.length;    (Another way to solve the question but not the best optimized approach)

boolean Find=false;

        Arrays.sort(arr);

int y=0;
        for(int i=n-1;i>0;i--){
        if(arr[i]<x||(arr[i]==x&&arr[0]!=0)){
        break;
        }
        if(arr[i]==x&&arr[0]==0){
Find=true;
        break;
        }
        if(arr[i]>x){
y=arr[i]-x;
                for(int j=i-1;j>=0;j--){
        if(arr[j]==y){
Find=true;
        break;
        }
        }
        }
        }
        return Find;

 */