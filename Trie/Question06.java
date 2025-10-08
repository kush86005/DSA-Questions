package Trie;
import java.util.*;
public class Question06 {
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
    public static int countnode(Node root){
        Node current=root;
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(current.children[i]!=null){
                count+=1+countnode(current.children[i]);
            }
        }
        return count;
    }
    public static int substring(String word){
        Node current=root;
        for(int i=0;i<word.length();i++){
            String s=word.substring(i);
            insert(s);
        }
        return countnode(root);
    }

    public static void main(String[] args) {
        System.out.print("Enter element:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=substring(str);
        System.out.print(count);
    }
}
