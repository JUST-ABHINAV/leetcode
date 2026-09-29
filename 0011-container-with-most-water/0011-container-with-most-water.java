class Solution {
    public int maxArea(int[] height) {
    int lp=0;
    int rp=height.length-1;
    int maxwater=0;
    while (lp<rp){
        int w=rp-lp;
        int h=Math.min(height[rp],height[lp]);

        maxwater=Math.max(maxwater,w*h);
        if (height[rp]>height[lp]){
            lp++;
        }
        else{
            rp--;
        }
    }
    return maxwater;      
}}