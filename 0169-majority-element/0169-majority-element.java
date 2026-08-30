class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;

        for (int i: nums){
            if (count==0){
                count++;
                candidate=i;
            }
            else if (candidate==i){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}