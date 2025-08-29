package GoogleLeetcode;
import java.util.*;
public class Question10 {
    public static String restore(String s,int[] arr){
        int n=arr.length;
        Map<Integer,Character> digit=new TreeMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            digit.put(arr[i],c);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,Character> enter:digit.entrySet()){
            char c=enter.getValue();
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int n=s.length();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String sb=restore(s,arr);
        System.out.print(sb);
    }
}
