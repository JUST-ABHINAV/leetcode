class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
        for (int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            set.add(i);
        }
        for (int i=min+1;i<max;i++){
            if (!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}