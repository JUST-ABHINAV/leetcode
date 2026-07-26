class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        // int pro=1;
        // int res=1;
        // for (int i=nums.length-1;i>nums.length-4;i--){
        //     pro=pro*nums[i];
        // }
        // for (int i=0;i<2;i++){
        //     res=res*nums[i];
        // }
        // res=res*nums[nums.length-1];
        int len=nums.length;
        return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-1]*nums[len-2]*nums[len-3]);
    }
}