package array;

import java.util.*;

public class Array30 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        System.out.print("Enter k:- ");
        int k=sc.nextInt();

        ArrayList<int[]> pair=new ArrayList<>();

        for(int i=0;i<size-1;i++){
            if(number[i]+number[i+1]==k){
                pair.add(new int[]{number[i],number[i+1]});
            }
        }
        if(pair.isEmpty()){
            System.out.print("No pairs found");
            return;
        }
        Collections.sort(pair, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        System.out.print("Pairs are:- ");
        for(int i=0;i<pair.size();i++){
            System.out.print(Arrays.toString(pair.get(i))+" ");
        }
    }
}
