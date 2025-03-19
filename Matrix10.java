import java.util.*;

public class Matrix10 {
    public static void main(String[] args) {

        System.out.print("Enter rows:- ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.print("Enter columns:- ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];

        System.out.print("Enter values:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<c;i++){
            map.put(num[0][i],1);
        }

        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(map.containsKey(num[i][j])&&map.get(num[i][j])==i){
                    map.put(num[i][j],map.get(num[i][j])+1);
                }
            }
        }
        System.out.print("Common elements:- ");
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(entry.getValue()==r){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
