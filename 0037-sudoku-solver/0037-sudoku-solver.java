class Solution {
    public int[] findempty(char[][] board){
        int[] arr=new int[ ]{-1,-1};
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (board[i][j]=='.'){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;

    }

    public boolean issafe (char[][] arr,int r,int c,int i){
        for (int k=r;k<arr.length;k++){
            if (arr[k][c]==(char)('0' + i))return false;
        }
        for (int k=r;k>=0;k--){
            if (arr[k][c]==(char)('0' + i))return false;
        }
        for (int k=c;k<arr[0].length;k++){
            if (arr[r][k]==(char)('0' + i))return false;
        }
        for (int k=c;k>=0;k--){
            if (arr[r][k]==(char)('0' + i))return false;
        }

        int brow=3*(r/3);
        int bcol=3*(c/3);

        for (int k=0;k<3;k++){
            for (int m=0;m<3;m++){
                if (arr[brow+k][bcol+m] == (char)('0' + i))return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve (board);
    }
    public boolean solve(char[][] board) {

    int[] arr = findempty(board);

    if (arr[0] == -1) {
        return true;
    }

    for (int i = 1; i <= 9; i++) {

        if (issafe(board, arr[0], arr[1], i)) {

            board[arr[0]][arr[1]] = (char) ('0' + i);

            if (solve(board)) {
                return true;
            }


            board[arr[0]][arr[1]] = '.';
        }
    }
    return false;
}
}