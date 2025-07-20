package string;

import java.util.*;

public class String11 {
    public static void main(String[] args) {

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        sc.nextLine();

        System.out.print("Enter string:- ");
        String str=sc.nextLine().trim();


        System.out.print("Enter dictionary:- ");
        ArrayList<String> dictionary=new ArrayList<>();
        for(int i=0;i<n;i++) {
            String str1=sc.nextLine().trim();
            dictionary.add(str1);
        }
        boolean found=false;

        for(int i=0;i<n-1;i++){
            String a= dictionary.get(i);
            if(!Objects.equals(a, str)){
                for(int j=i+1;j<n;j++){
                    String b= dictionary.get(j);
                    if(!Objects.equals(b,str)) {
                        if ((a + b).equals(str)) {
                            found = true;
                            break;
                        }
                    }else{
                        found=true;
                        break;
                    }
                }if(found){
                    break;
                }
            }else{
                found=true;
            }
        }
        System.out.println(found);
    }
}
