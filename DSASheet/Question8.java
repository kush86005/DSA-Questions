package DSASheet;
import java.util.*;
public class Question8 {
    public static ArrayList<ArrayList<String>> Anagram(String[] arr){
        HashMap<String,List<String>> digit=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char[] chrs=arr[i].toCharArray();
            Arrays.sort(chrs);
            String sorted=new String(chrs);

            if(!digit.containsKey(sorted)){
                digit.put(sorted,new ArrayList<>());
            }
            digit.get(sorted).add(arr[i]);
        }
        ArrayList<ArrayList<String>> group=new ArrayList<>();
        for(List<String> result:digit.values()){
            group.add(new ArrayList<>(result));
        }
        return group;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextLine();
        }
        ArrayList<ArrayList<String>> result=Anagram(arr);
        System.out.println(result);
    }
}
