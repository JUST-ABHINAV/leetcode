class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>() ,res);
        return res;
    }
    private void helper(int idx, int[] nums,List<Integer> temp , List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        
        for(int i=idx; i<nums.length; i++){
            temp.add(nums[i]);
            helper(i+1, nums,temp, res );
            temp.remove(temp.size()-1);
        }
        
    }
}

       