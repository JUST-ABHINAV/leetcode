class Solution {
    public int numSub(String s) {
        long total=0;
        int [] prefix =new int[s.length()];
        if (s.charAt(0)=='1'){
            prefix[0]=1;
            // total++;
            }
        else prefix[0]=0;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)=='1'){
                prefix[i]=prefix[i-1]+1;
            }
            else prefix[i]=0;
        }
        long MOD = 1_000_000_007;
        for (int i = 1; i < prefix.length; i++) {
            if (prefix[i] == 0 && prefix[i - 1] != 0) {
                int n = prefix[i - 1];
                total = (total + (long)n * (n + 1) / 2) % MOD;
            }
        }

        if (prefix[prefix.length - 1] != 0) {
            int n = prefix[prefix.length - 1];
            total = (total + (long)n * (n + 1) / 2) % MOD;
        }
        
       
        return (int)total;
    }

}