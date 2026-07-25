class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left=0;
        int right=0;
        int n=p.length();
        boolean flag=true;
        ArrayList<Integer> list=new ArrayList<>();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>(); 
        for (char c:p.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        while (right<s.length()){
            if (right-left<n){
                map2.put(s.charAt(right),map2.getOrDefault(s.charAt(right),0)+1);
                right++;
            }
            if (right-left==n){
                if (map1.equals(map2)){
                    list.add(left);
                }
                char ch = s.charAt(left);

                map2.put(ch, map2.get(ch) - 1);

                if (map2.get(ch) == 0) {
                    map2.remove(ch);
                }

                left++;
            }
        }
        return list;
    }
}