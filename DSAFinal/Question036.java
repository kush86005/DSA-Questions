package DSAFinal;
import java.util.*;

public class Question036 {
    private static StringBuilder string(String q) {
        StringBuilder sb = new StringBuilder();
        for (char c : q.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb;
    }

    public static boolean compare(String s, String t) {
        return string(s).toString().equals(string(t).toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s = sc.nextLine();

        System.out.print("Enter String 2: ");
        String t = sc.nextLine();

        System.out.println(compare(s, t));
    }
}
