package Top200;
import java.util.*;
public class Question40 {
    public static int Space(String str){
        int s=str.length();
        if(s==0){
            System.out.print("Invalid Input");
            return 0;
        }
        int space=0;
        for(int i=0;i<s;i++){
            if(str.charAt(i)==' '){
                space++;
            }
        }
        return space+1;
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int ans=Space(str);
        System.out.print(ans);
    }
}
