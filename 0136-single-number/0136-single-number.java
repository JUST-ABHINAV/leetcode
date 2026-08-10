class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if (map.get(i)>1)map.remove(i);
        }
        return map.keySet().iterator().next();
    }
}