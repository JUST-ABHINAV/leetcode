class Solution {
    public int maxProduct(int n) {
        int x=0;
        int max1=0;
        int max2=0;
        while (n>=1){
            int m=n%10;
            n=n/10;
            if (m>max1){
                max2=max1;
                max1=m;
            }
            else if (m>=max2 && m<=max1){
                max2=m;
            }
        }
        return max1*max2;
    }
}