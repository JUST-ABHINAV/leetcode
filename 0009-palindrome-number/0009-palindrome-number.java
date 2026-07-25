class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        String ss=sb.toString();
        if (s.equals(ss))return true;
        return false;
        
    }
}