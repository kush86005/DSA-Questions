import java.util.*;

public class String20 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Set<Character> table=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            table.add(ch);
        }
        int n=table.size();

        System.out.print(n);
    }
}

/*   //Same code using arraylist

import java.util.*;

public class String20 {
    public static void main(String[] args) {

        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ArrayList<Character> table = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!table.contains(ch)) {
                table.add(ch);
            }
        }
        int n = table.size();

        System.out.println("Number of distinct characters: " + n);
    }
}
 */

