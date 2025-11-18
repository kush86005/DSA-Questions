package MasterSheet;
import java.util.*;
public class Question016 {
    public static int substring(String s){
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int ans=0;
        while(i<s.length()&&j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans=Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        int ans=substring(s);
        System.out.print(ans);
    }
}
