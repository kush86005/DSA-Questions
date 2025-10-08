package Trie;
import java.util.*;
public class Question02 {
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
    static Node root=null;
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
    public static boolean search(String s){
        Node current=root;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
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
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
            insert(words[i]);
        }
        System.out.print("Enter word to search:- ");
        String str=sc.nextLine();
        boolean isTrue=search(str);
        System.out.print(isTrue);
    }
 }
