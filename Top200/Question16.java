package Top200;

import java.util.*;
public class Question16 {
    public static void Reverse(int n){

        while(n%10==0&&n!=0){
            n=n/10;
        }

        List<Integer> digit=new ArrayList<>();

        while(n>0){
            digit.add(n%10);
            n=n/10;
        }
            for(int i=0;i<digit.size();i++){
                int f=digit.get(i);
                System.out.print(f);
            }
    }
    public static void main(String[] args){

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Reverse(n);
    }
}
