package Trie;
import java.util.*;
public class Question05 {
    public static class Node{
        Node[] children;
        boolean eow;

        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node current=root;
        for(int i=0;i<word.length();i++){
            int ind=word.charAt(i)-'a';
            if(current.children[ind]==null){
                current.children[ind]=new Node();
            }
            current=current.children[ind];
        }
        current.eow=true;
    }
    public static boolean startswith(String word){
        if(word==null||word.length()==0){
            return true;
        }
        Node current=root;
        for(int i=0;i<word.length();i++){
            int ind=word.charAt(i)-'a';
            if(current.children[ind]==null){
                return false;
            }
            current=current.children[ind];
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter elements:- ");
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
            insert(str[i]);
        }
        System.out.print("Enter prefix:- ");
        String s=sc.nextLine();
        boolean isTrue=startswith(s);
        System.out.print(isTrue);
    }
}
