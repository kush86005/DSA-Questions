package Top200;
import java.util.*;
public class Question30 {
    public static int Triplet(int[] arr,int n){

        int s=arr.length;

        HashMap<Integer, Integer> digit=new HashMap<>();

        for(int i=0;i<s;i++){
            digit.put(arr[i],digit.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(int i=0;i<s-1;i++){
            for(int j=i+1;j<s;j++){
                int one=arr[i];
                int two=arr[j];
                int value=one+two;
                int contain=n-value;
                if(digit.containsKey(contain)){
                    int ans1= digit.get(one);
                    int ans2=digit.get(two);
                    int ans3=digit.get(contain);
                    while(ans1>0&&ans2>0&&ans3>0){
                        count++;
                        ans1--;
                        ans2--;
                        ans3--;
                    }
                    digit.put(one,ans1);
                    digit.put(two,ans2);
                    digit.put(contain,ans3);
                }
            }
        }
        return count;
    }
}
