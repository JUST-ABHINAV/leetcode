class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ret=new int[2];
         Map<Integer,Integer> mp =  new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(target-arr[i])){
                ret[0]=i;
                ret[1]=mp.get(target-arr[i]);
                return ret;
            }
            else{
                mp.put(arr[i],i);
            }
        }
        return ret;
    }
}