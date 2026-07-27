class Solution {

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

    public void addBoard(boolean[][] arr, List<List<String>> ans) {
        List<String> board = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j] ? 'Q' : '.');
            }
            board.add(sb.toString());
        }

        ans.add(board);
    }

    public void placeQueens(int i, int n, boolean[][] arr, List<List<String>> ans) {
        if (i == n) {
            addBoard(arr, ans);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(i, j, arr)) {
                arr[i][j] = true;
                placeQueens(i + 1, n, arr, ans);
                arr[i][j] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        boolean[][] arr = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();

        placeQueens(0, n, arr, ans);

        return ans;
    }
}