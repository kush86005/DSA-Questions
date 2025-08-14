package Top200;
import java.util.*;
public class Question42 {
    public static void SubString(String str){

        int s=str.length();

        for(int i=0;i<s;i++){
            for(int j=i+1;j<=s;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        SubString(str);
    }
}
