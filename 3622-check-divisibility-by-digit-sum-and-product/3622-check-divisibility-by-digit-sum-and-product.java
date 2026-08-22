class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int t=n;
        while (t>0){
            int m=t%10;
            s+=m;
            p*=m;
            t=t/10;
        }
        if (n%(s+p)==0)return true;
        return false;
    }
}