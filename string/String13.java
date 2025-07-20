package string;

import java.util.*;

public class String13 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> Combine = new Stack<>();


        if (str.length() % 2 != 0) {
            System.out.print("-1");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{') {
                Combine.push(ch);
            } else if (ch == '}' && !Combine.isEmpty() && Combine.peek() == '{') {
                Combine.pop();
            } else if (ch == '}') {
                Combine.push(ch);
            }
        }
        int left = 0;
        int right = 0;

        while (!Combine.isEmpty()) {
            char top = Combine.pop();
            if (top == '{') {
                left++;
            } else {
                right++;
            }
        }
        int ans=((left+1)/2+(right+1)/2);

        System.out.print(ans);
    }
}
