package string;

import java.util.*;

public class String12 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String str[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8",
                         "88","888","9","99","999","9999"};

        String str1="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                str1+='0';
            }else{
                int j=s.charAt(i)-'A';
                str1+=str[j];
            }
        }
        System.out.println(str1);
    }
}
