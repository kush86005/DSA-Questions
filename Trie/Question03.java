package Trie;
import java.util.*;
public class Question03 {
    public static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (current.children[ind] == null) {
                current.children[ind] = new Node();
            }
            current = current.children[ind];
        }
        current.eow = true;
    }

    public static boolean search(String key) {
        Node current = root;
        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';
            if (current.children[ind] == null) {
                return false;
            }
            current = current.children[ind];
        }
        return current.eow;
    }

    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String prefix = key.substring(0, i);
            String remaining = key.substring(i);
            if (search(prefix) && wordbreak(remaining)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter elements:- ");
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine().toLowerCase();
            insert(str[i]);
        }
        System.out.print("Enter key:- ");
        String key = sc.nextLine().toLowerCase();
        boolean isTrue = wordbreak(key);
        if (isTrue == false) {
            System.out.print("The key dosent exists");
        } else {
            System.out.print("The key exists");
        }
    }
}
