package MasterSheet;

public class Question027 {
    public static int koko(int[] piles,int h){
        int low=1;
        int high=0;
        for(int pile:piles){
            if(pile>high){
                high=pile;
            }
        }
        int result=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hours=0;
            for(int pile:piles){
                hours+=Math.ceil((double)(pile)/mid);
            }
            if(hours<=h){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] pile=new int[]{3,6,7,11};
        int h=8;
        System.out.print(koko(pile,h));
    }
}
