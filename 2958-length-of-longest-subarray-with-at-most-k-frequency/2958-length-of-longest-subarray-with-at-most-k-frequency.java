class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        int left=0;
        int right=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while (right<arr.length && left<=right){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            if (map.get(arr[right])>k){
                while (map.get(arr[right])>k){
                    map.put(arr[left],map.get(arr[left])-1);
                    left++;
                }
               
            }
             max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}