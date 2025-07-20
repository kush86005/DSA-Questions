package string;

import java.util.*;

public class String17 {
    public static void main(String[] args) {

        System.out.print("Enter Binary String:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int flip=0;
        int flip2=0;

        for(int i=0;i<str.length()-1;i++){
            char num=str.charAt(i);

            if(i%2==0&&num=='1'){
                flip++;
            }else if(i%2!=0&&num=='0'){
                flip++;
            }
            if(i%2==0&&num=='0'){
                flip2++;
            }else if(i%2!=0&&num=='1'){
                flip2++;
            }
        }
        int min=Math.min(flip2,flip);

        System.out.print(min);
    }
}
