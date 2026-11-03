class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int sum=0;
        for (int i:nums){
            sum+=i;
            if(i>max)max=i;
            }
        // for(int i:nums){
        //     sum+=max-i;
        // }    
        return max*nums.length-sum;
    }
}