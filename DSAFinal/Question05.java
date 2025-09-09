package DSAFinal;
import java.util.*;

public class Question05 {
    public static boolean isAnagram(String s, String t) {
        // Remove this if you want case-sensitive anagram check
        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() != t.length()) {
            return false;
        }

        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && Character.isLetter(t.charAt(i))) {
                alpha[s.charAt(i) - 'a']++;
                alpha[t.charAt(i) - 'a']--;
            } else {
                // Optional: Handle non-alphabetic characters
                return false;
            }
        }

        for (int count : alpha) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s = sc.nextLine();

        System.out.print("Enter string 2: ");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}
