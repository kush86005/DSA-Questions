package DSASheet;
import java.util.*;
public class Question7 {
    public static List<List<String>> Anagram(String[] strs){
        HashMap<String,List<String>> digit=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chrs=strs[i].toCharArray();
            Arrays.sort(chrs);
            String sorted=new String(chrs);

            if(!digit.containsKey(sorted)){
                digit.put(sorted,new ArrayList<>());
            }
            digit.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(digit.values());
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter elemets:- ");
        String[] strs=new String[s];
        for(int i=0;i<s;i++){
            strs[i]=sc.nextLine();
        }
        List<List<String>> result=Anagram(strs);
        for(List<String> group: result){
            System.out.print(group);
        }
    }
}
