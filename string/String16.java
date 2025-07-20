package string;

import java.util.*;

public class String16 {
    public static void main(String[] args) {

        System.out.print("Enter number of Strings:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        ArrayList<String> Final=new ArrayList<>();

        System.out.print("Enter Strings:- ");
        for(int i=0;i<n;i++){
            Final.add(sc.nextLine());
        }

        ArrayList<Character> CommonPrefix=new ArrayList<>();

        int Min=Integer.MAX_VALUE;
        for(int i=0;i<Final.size();i++){
            String str=Final.get(i);
            Min=Math.min(Min,str.length());
        }

        for(int i=0;i<Min;i++){
            char obc=Final.get(0).charAt(i);

            for(int j=1;j<Final.size();j++){
                if(Final.get(j).charAt(i)!=obc){
                    System.out.print("Common prefix:- ");
                    for(int k = 0; k <CommonPrefix.size(); k++) {
                        System.out.print(CommonPrefix.get(k));
                    }
                    return;
                }
            }
            CommonPrefix.add(obc);
        }
        System.out.print("Common prefix:- ");
        for(int k = 0; k <CommonPrefix.size(); k++) {
            System.out.print(CommonPrefix.get(k));
        }
    }
}
