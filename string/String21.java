package string;

import java.util.*;

public class String21 {
    public static void main(String[] args) {

        System.out.println("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder(s);

        int i=0;
        int j=s.length()-1;
        int count=0;
        int k=0;

        while(i<j){
            char c=s.charAt(i);
            char ch=s.charAt(j);
            if(c!=ch){
                sb.insert(k,ch);
                k++;
                j--;
                count++;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("Output:- "+count);
        System.out.print("String after update:- "+sb);
    }
}
