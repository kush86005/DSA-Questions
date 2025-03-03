import java.util.*;

public class Array26 {
    public static void main(String[] args){

        System.out.print("Enter size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[][]=new int[size][2];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i][0]=sc.nextInt();
            number[i][1]=sc.nextInt();
        }

        Arrays.sort(number, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]>result=new ArrayList<>();

        int[] newInteval=number[0];
        result.add(newInteval);

        for(int i=1;i<size;i++){
            int[] interval=number[i];
            if(newInteval[1]>=interval[0]){
                    newInteval[1]=Math.max(newInteval[1],interval[1] );
            }else{
                newInteval=interval;
                result.add(newInteval);
            }
        }
        System.out.println("Merged Interval:- "+Arrays.deepToString(result.toArray()));
    }
}
