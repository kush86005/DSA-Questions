import java.util.*;

public class ifelse{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();

        if(num==1){
            System.out.print("Hello");
        }else if(num==2){
            System.out.print("Namaste");
        }else if(num==3){
            System.out.print("Bonjour");
        }else{
            System.out.print("Invalid input");
        }
    }
}