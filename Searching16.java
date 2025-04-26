import java.util.*;

public class Searching16 {
    public static void main(String[] args){

        System.out.print("Enter range size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter query size:- ");
        int q=sc.nextInt();

        TreeSet<Integer> Sorted=new TreeSet<>();

        System.out.print("Enter starting and ending of range:- ");
        for(int i=0;i<n;i++){
            int start=sc.nextInt();
            int end=sc.nextInt();

            for(int val=start;val<=end;val++){
                Sorted.add(val);
            }
        }

        ArrayList<Integer> Ans=new ArrayList<>(Sorted);

        int[] query=new int[q];
        System.out.print("Enter queries:- ");
        for(int i=0;i<q;i++) {
            query[i]=sc.nextInt();
        }

        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<q;i++){
            if(query[i]<=Ans.size()){
                result.add(Ans.get(query[i]-1));
            }else{
                result.add(-1);
            }
        }
        System.out.print(result);
    }
}
