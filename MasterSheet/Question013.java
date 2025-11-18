package MasterSheet;

public class Question013 {
    public static int height(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int ans=0;
        int area=0;
        while(i<j){
            if(arr[i]<arr[j]){
                ans=arr[i]*(j-i);
                i++;
            }else{
                ans=arr[j]*(j-i);
                j--;
            }
            area=Math.max(area,ans);
        }
        return area;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,6,2,5,4,8,3,7};
        int ans=height(arr);
        System.out.print(ans);
    }
}
