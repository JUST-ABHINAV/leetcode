class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int right=0;
        int count=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            count++;
        if (map.get(s.charAt(right))>2){
            max=Math.max(max,count-1);
            while (map.get(s.charAt(right))>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                count--;
                if (map.get(s.charAt(left))<=0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
        }
        max=Math.max(max,count);
        right++;
    }
    return max;
    }
}