package GoogleLeetcode;
import java.util.*;
public class Question5 {
    public static String ipAddress(String str){
        int n=str.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(c=='.'){
                ans.append("[.]");
            }else if(c!='.'){
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.print("Enter IP address:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String ans=ipAddress(str);
        System.out.print(ans);
    }
}
