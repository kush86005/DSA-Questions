package DSAFinal;
import java.util.*;
public class Question10 {
    public static List<List<String>> groupAnagram(String[] str){
        int n=str.length;
        HashMap<String,List<String>> digit=new HashMap<>();
        for(int i=0;i<n;i++){
            char[] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);

            if(!digit.containsKey(sorted)){
                digit.put(sorted,new ArrayList<>());
            }
            digit.get(sorted).add(str[i]);
        }
        return new ArrayList<>(digit.values());
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        List<List<String>> res=new ArrayList<>();
        res=groupAnagram(str);
        System.out.print(res);
    }
}
