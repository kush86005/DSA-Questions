package MasterSheet;

//Time complexity for fixed 9*9 matrix is O(1) but for n*n matrix it will be O(n^3)
public class Question009 {
    public static boolean helper(char[][] board,int row,int col,char num) {
        for(int i=0;i<9;i++){
            if(i!=col&&board[row][i]==num) {
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i!=row&&board[i][col]==num){
                return false;
            }
        }
        int start=row-row%3;
        int end=col-col%3;
        for(int i=start;i<start+3;i++){
            for(int j=end;j<end+3;j++){
                if(i!=row&&j!=col&&board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean valid(char[][] board){
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    char num = board[row][col];
                    if (!helper(board, row, col, num)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '8', '.', '6', '.', '.', '3' },
                { '4', '7', '9', '8', '.', '1', '.', '.', '5' },
                { '7', '1', '4', '.', '3', '5', '9', '2', '.' },
                { '.', '6', '3', '9', '1', '2', '8', '.', '.' },
                { '9', '5', '.', '3', '2', '.', '.', '.', '6' },
                { '.', '4', '.', '.', '8', '.', '7', '9', '.' }
        };
        System.out.print(valid(board));
    }
}
