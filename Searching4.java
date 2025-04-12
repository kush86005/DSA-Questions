import java.util.*;

public class Searching4 {
    public static int CountSquare(int n){

        double root=Math.sqrt(n);

        int count=0;
        for(int i=1;i<root;i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args){

        System.out.print("Enter Square number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int result=CountSquare(n);
        System.out.print("Perfect square less than number:- "+result);
    }
}
