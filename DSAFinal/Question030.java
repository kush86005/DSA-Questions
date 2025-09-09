package DSAFinal;
import java.util.*;
public class Question030 {
    public static int Longest(String s){
        int n=s.length();
        HashSet<Character> digit=new HashSet<>();
        int i=0;
        int j=0;
        int ans=0;
        while(j<n){
            if(!digit.contains(s.charAt(j))){
                digit.add(s.charAt(j));
                j++;
                ans=Math.max(ans,j-i);
            }else{
                digit.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int ans=Longest(s);
        System.out.print(ans);
    }
}
