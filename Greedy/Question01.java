package Greedy;
import java.util.*;
public class Question01 {
    public static int activitySelection(int[] start, int[] finish) {
        int n=start.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i);
        }
        Collections.sort(arr,(a,b)->(finish[a]-finish[b]));
        int max=1;
        int last=finish[arr.get(0)];
        for(int i=1;i<n;i++){
            int index=arr.get(i);
            if(start[index]>last){
                max++;
                last=finish[index];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.print("Enter start size:- ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.print("Enter elements:- ");
        int[] start=new int[m];
        for(int i=0;i<m;i++){
            start[i]=sc.nextInt();
        }
        System.out.print("Enter end size:- ");
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            end[i]=sc.nextInt();
        }
        int ans=activitySelection(start,end);
        System.out.print(ans);
    }
}
