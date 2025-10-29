package PriorityQueue;
import java.util.*;
public class Question05 {

    public static String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxheap=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());

        maxheap.addAll(map.entrySet());

        StringBuilder str=new StringBuilder();

        while(!maxheap.isEmpty()){
            Map.Entry<Character,Integer> entry=maxheap.poll();
            for(int i=0;i<entry.getValue();i++){
                str.append(entry.getKey());
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String str=frequencySort(s);
        System.out.print(str);
    }
}
