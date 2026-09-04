class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums.length==1){
            return 0;
        }
        int n=nums.length;
        int[] prefix=new int[nums.length];
        int[] sufix=new int[nums.length];
        prefix[0]=nums[0];
        sufix[n-1]=nums[n-1];
        for (int i=1;i<nums.length;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }
        for (int i=n-2;i>=0;i--){
            sufix[i]=Math.min(sufix[i+1],nums[i]);
        }
        for (int i=0;i<n;i++){
            if (prefix[i]-sufix[i]<=k){
                System.out.print(prefix[i]+"\n"+sufix[i]);
                return i;
                
            }
        }
        return -1;
    }
}