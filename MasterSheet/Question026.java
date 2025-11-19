package MasterSheet;
import java.util.*;
public class Question026 {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] car=new double[n][2];
        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a,b)->Double.compare(b[0],a[0]));

        Stack<Double> stack=new Stack<>();

        for(int i=0;i<n;i++){
            double time=(target-car[i][0])/car[i][1];

            if(stack.isEmpty()||time>stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        int target=12;
        int[] position=new int[]{10,8,0,5,3};
        int[] speed=new int[]{2,4,1,1,3};
        int ans=carFleet(target, position, speed);
        System.out.print(ans);
    }
}
