import java.util.*;

public class String15 {
    public static void main(String[] args) {

        Map<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();

        int total=0;
        for(int i=0;i<str.length();i++){
            int currentVal=roman.get(str.charAt(i));

            if(i+1<str.length()){
                int nextVal=roman.get(str.charAt(i+1));

                if(currentVal>nextVal){
                    total+=currentVal;
                }else if(currentVal<nextVal){
                    total-=currentVal;
                }
                }else{
                total+=currentVal;
            }
        }
        System.out.print(total);
    }
}
