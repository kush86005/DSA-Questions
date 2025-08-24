package DSASheet;
import java.util.*;
public class Question17 {
    public static int maxProfit(int[] prices){
        int minvalue=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<minvalue){
                minvalue=price;
            }
            int profit=price-minvalue;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter elements:- ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxProfit(arr);
        System.out.print(ans);
    }
}
