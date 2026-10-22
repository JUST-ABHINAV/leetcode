class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle))return 0;
        int n=needle.length();
        int left=0;
        int right=left+n;
        while(right<=haystack.length()){
            String nm=haystack.substring(left,right);
            if (nm.equals(needle))return left;
            left++;right++;
        }
        return -1;
    }
}