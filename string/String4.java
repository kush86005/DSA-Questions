package string;

import java.util.*;

public class String4 {
    public static void main(String[] args) {

        System.out.print("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        boolean found = false;

        if (str1.length() == str2.length()) {
            String combined = str1 + str1;

            if (combined.contains(str2)) {
                found = true;
            }
        }
        System.out.println(found);
    }
}

