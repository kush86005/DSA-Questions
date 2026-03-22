import java.util.*;

public class temp2{
    public static boolean valid(String s,String t){
        if (s.length() != t.length()) {
            return false;
        }
        int n=s.length();
        int m=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int j=0;j<m;j++){
            char ch=t.charAt(j);
            if(!map.containsKey(ch)||map.get(ch)==0){
                return false;
            }
            int val=map.get(ch)-1;
            map.put(ch,val);
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaam";
        boolean ans=valid(s,t);
        System.out.print(ans);
    }
}
