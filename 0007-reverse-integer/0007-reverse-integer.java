class Solution {
    public int reverse(int x) {
        int n=x;
        long rev=0;
        if (x<0)n= -x;
        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if (x<0)rev= -rev;
        if (rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)return 0;
        return (int)rev;
    }
}