package Stack;
import java.util.*;

public class Question04 {
    public static boolean balanced(String str){
        Stack<Character> s = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (s.isEmpty()) {
                    return false;
                }
                char top = s.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        boolean isTrue = balanced(s);
        System.out.println(isTrue);
    }
}
