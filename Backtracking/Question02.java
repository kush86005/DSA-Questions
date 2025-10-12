package Backtracking;
import java.util.*;
public class Question02 {
    public static void per(String s,String t,ArrayList<String> arr){
        if(s.equals("")){
            arr.add(t);
            return;
        }
        HashSet<Character> seen=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(seen.contains(c)){
                continue;
            }
            seen.add(c);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String rem=left+right;
            per(rem,t+c,arr);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        ArrayList<String> arr=new ArrayList<>();
        String t="";
        per(s,t,arr);
        System.out.print(arr);
    }
}
