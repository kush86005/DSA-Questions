package GoogleLeetcode;
import java.util.*;
public class Question11 {
    public static int count(String ring){
        int n=ring.length();
        Map<Integer,List<Character>> digit=new HashMap<>();
        for(int i=1;i<n;i+=2){
            int val=ring.charAt(i)-'0';
            char c=ring.charAt(i-1);
            if(!digit.containsKey(val)){
                digit.put(val,new ArrayList<>());
            }
            digit.get(val).add(c);
        }
        int count=0;
        for(Map.Entry<Integer,List<Character>> enter:digit.entrySet()){
            List<Character> ans=enter.getValue();
            if(ans.contains('R')&&ans.contains('G')&&ans.contains('B')){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int ans=count(s);
        System.out.print(ans);
    }
}
