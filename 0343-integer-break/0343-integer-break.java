class Solution {
    public int func(int n,int[] dp){
        if(n==1)return 1;
        if(dp[n]!=0)return dp[n];
        int max=0;
        for(int i=1;i<n;i++){
            int a=i*(n-i);
            int b=i*func(n-i,dp);
            max=Math.max(max,Math.max(a,b));
        }
        dp[n]=max;
        return dp[n];
    }
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,0);
        return func(n,dp);
    }
}