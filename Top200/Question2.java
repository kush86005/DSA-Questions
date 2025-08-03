package Top200;
import java.util.*;

public class Question2 {
    public static void main(String[] args){

        System.out.print("Enter a character:- ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);

        if(c>='A'&&c<='Z'){
            System.out.print("1");
        }else if(c>='a'&&c<='z'){
            System.out.print("0");
        }else{
            System.out.print("-1");
        }
    }
}
