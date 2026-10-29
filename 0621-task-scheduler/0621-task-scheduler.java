class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for (char i:tasks){
            char ch=i;
            freq[ch-'A']++;
        }
        int max=0;int count=0;
        for (int i:freq){
            if (i>max){
                max=i;
                count=1;
            }else if(max==i)count++;
        }
        return Math.max(tasks.length,((max-1)*(n+1)+count));
    }
}