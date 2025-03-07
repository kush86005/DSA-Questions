import java.util.*;

public class Array35{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] num=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int leftpointer=1;
        int rightpointer=1;
        int ans=num[0];

        for(int i=0;i<size;i++){
            leftpointer*=num[i];
            rightpointer*=num[size-1-i];
            ans=Math.max(ans,Math.max(leftpointer,rightpointer));
            if(leftpointer==0&&rightpointer==0){
                leftpointer=1;
                rightpointer=1;
            }
        }
        System.out.print("Maximum product:- "+ans);
    }
}