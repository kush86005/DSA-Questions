package MasterSheet;
import java.util.*;
public class Question004 {
    public static List<List<String>> anagram(String[] str){
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<str.length;i++){
            char[] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);

            map.putIfAbsent(s, new ArrayList<>());

            map.get(s).add(str[i]);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] str=new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans=anagram(str);
        System.out.print(ans);
    }
}
