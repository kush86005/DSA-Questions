import java.util.*;

public class Array40 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] num=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        boolean isTriplet=false;
        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size-1;j++){
                for(int z=j+1;z<size;z++){
                    if(num[i]+num[j]+num[z]==k){
                        isTriplet=true;
                    }
                }
            }
        }
        System.out.print(isTriplet);
    }
}
