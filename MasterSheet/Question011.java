package MasterSheet;
import java.util.*;
public class Question011 {
    public static List<List<Integer>> threesum(int[] arr){
        if(arr==null||arr.length<3){
            return new ArrayList<>();
        }
        int n=arr.length;
        Arrays.sort(arr);
        HashSet<List<Integer>> result=new HashSet<>();
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> ans=threesum(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
        }
    }
}
