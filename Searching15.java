import java.util.*;

public class Searching15 {

    private static int countsetbit(int n){
        return Integer.bitCount(n);
    }
    public static void sortbyset(Integer[] arr){
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                int countA=countsetbit(a);
                int countB=countsetbit(b);

                if(countA!=countB){
                    return countB-countA;
                }
                return 0;
            }
        });
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Integer[] num=new Integer[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
                num[i]=sc.nextInt();
        }

        sortbyset(num);

        System.out.print(Arrays.toString(num));
    }
}
