class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int cnt=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    helper(grid,i,j);
                    cnt++;
                }
                
            }
        }
        return cnt;
    }
    public void helper(char grid[][],int i,int j){
        if(i>grid.length-1||i<0||j>grid[0].length-1||j<0||grid[i][j]=='0')return;

        grid[i][j]='0';

        helper(grid,i+1,j);
        helper(grid,i-1,j);
        helper(grid,i,j+1);
        helper(grid,i,j-1);
    }
}