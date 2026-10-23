class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        int right=10;int left=0;
        HashSet<String> set= new HashSet<>();
        while (right<=s.length()){
            String str=s.substring(left,right);
            if (set.contains(str)){
                if (!list.contains(str))list.add(str);
            }
            else{
                set.add(str);
            }
            left++;right++;
        }
        return list;
    }
}