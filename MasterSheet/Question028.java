package MasterSheet;

public class Question028 {
    public static int rotated(int[] arr,int target){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[i]<=arr[mid]){
                if(arr[i]<=target&&target<arr[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(arr[mid]<target&&target<=arr[j]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{4,5,6,7,0,1,2};
        int target=0;
        System.out.print(rotated(nums,target));
    }
}
