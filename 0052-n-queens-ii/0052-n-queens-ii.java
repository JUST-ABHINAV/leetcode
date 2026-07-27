class Solution {
    int ans=0;
    public boolean isSafe(int i, int j, boolean[][] arr) {
        for (int k = 0; k < i; k++) {
            if (arr[k][j]) return false;
        }

        for (int r = i - 1, c = j - 1; r >= 0 && c >= 0; r--, c--) {
            if (arr[r][c]) return false;
        }

        for (int r = i - 1, c = j + 1; r >= 0 && c < arr.length; r--, c++) {
            if (arr[r][c]) return false;
        }

        return true;
    }
    public void placeQueens(int i, int n, boolean[][] arr) {
        if (i == n) {
            ans++;
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(i, j, arr)) {
                arr[i][j] = true;
                placeQueens(i + 1, n, arr);
                arr[i][j] = false;
            }
        }
    }
    public int totalNQueens(int n) {
        boolean[][] arr = new boolean[n][n];
        

        placeQueens(0, n, arr);

        return ans;
    }
}