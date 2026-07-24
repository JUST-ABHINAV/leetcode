class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1)return 0;
        int left=0;
        int right=1;
        int low=prices[0];int max=0;
        int profit=0;;
        for(right=0;right<prices.length;right++){
            if (prices[right]<low){
                left=right;
                low=prices[right];
                max=low;
                }
            if (right>left){
                if(prices[right]>max){
                    max=prices[right];
                }
                profit = Math.max(profit, max - low);
            }
        }
        return profit;
    }
}