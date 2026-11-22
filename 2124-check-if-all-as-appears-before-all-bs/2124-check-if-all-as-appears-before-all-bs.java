class Solution {
    public boolean checkString(String s) {
        int a=-1;
        int b=-1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(b<i && b!=-1)return false;
                a=i;
                } 
            else {
                b=i;
            }
        }
        return true;
    }
}