class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if (board[i][j] != '.') {   
                if (!issafe(board, i, j))
                    return false;
            }
            }
        }
        return true;
    }
   public boolean issafe(char[][] board, int r, int c) {

    char ch = board[r][c];

    for (int j = 0; j < 9; j++) {
        if (j != c && board[r][j] == ch)
            return false;
    }

    for (int i = 0; i < 9; i++) {
        if (i != r && board[i][c] == ch)
            return false;
    }

    int sr = (r / 3) * 3;
    int sc = (c / 3) * 3;

    for (int i = sr; i < sr + 3; i++) {
        for (int j = sc; j < sc + 3; j++) {
            if ((i != r || j != c) && board[i][j] == ch)
                return false;
        }
    }

    return true;
}
}