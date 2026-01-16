package MasterSheet;

public class Question026 {
    public static boolean gridsearch(int[][] mat,int target){
        int row=mat.length;
        int column=mat[0].length;
        if(mat==null||row==0||column==0){
            return false;
        }
        int i=0;
        int j=row*column-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int current=mat[mid/column][mid%column];
            if(current>target){
                j=mid-1;
            }else if(current<target){
                i=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target1 = 16;
        int target2 = 13;

        System.out.println("Searching for " + target1 + ": " + gridsearch(matrix, target1));
        System.out.println("Searching for " + target2 + ": " + gridsearch(matrix, target2));
    }
}
