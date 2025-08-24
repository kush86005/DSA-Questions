package DSASheet;
import java.util.*;
public class Question19 {
    public static int longsol(String s){
        HashSet<Character> set=new HashSet<>();
        int min=0;
        int max=0;
        int ans=0;
        while(max<s.length()){
            if(!set.contains(s.charAt(max))){
                set.add(s.charAt(max));
                max++;
                ans=Math.max(ans,max-min);
            }else{
                set.remove(s.charAt(min));
                min++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int ans=longsol(s);
        System.out.print(ans);
    }
}
