import java.util.*;

public class String23 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.print(sb.toString());
    }
}