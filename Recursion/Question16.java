package Recursion;
import java.util.*;
public class Question16 {
    public static StringBuilder remove(String s,int ind){
        if(ind==s.length()){
            return new StringBuilder();
        }
        StringBuilder sb=remove(s,ind+1);
        if(s.charAt(ind)!='a'){
            sb.append(s.charAt(ind));
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=remove(s,0);
        System.out.print(sb);
    }
}
