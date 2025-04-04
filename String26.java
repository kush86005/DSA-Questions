import java.util.*;

public class String26 {
    public static void main(String[] args) {


        System.out.print("Enter String1:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.print("Enter string2:- ");
        String str=sc.nextLine();

        if(s.length()!=str.length()){
            System.out.print("False");
            return;
        }

        Map<Character, Integer> sfinal=new HashMap<>();
        Map<Character, Integer> strfinal=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sfinal.put(c, sfinal.getOrDefault(c,0)+1);
        }
        for(int i = 0; i <str.length(); i++){
            char c=str.charAt(i);
            strfinal.put(c, strfinal.getOrDefault(c,0)+1);
        }

        List<Integer> Value=new ArrayList<>(sfinal.values());
        List<Integer> Values=new ArrayList<>(strfinal.values());

        int i=0;
        int j=0;

        while(i<Value.size()&&j<Values.size()){
            if(Value.get(i).equals(Values.get(j))){
                i++;
                j++;
            }else{
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
    }
}
