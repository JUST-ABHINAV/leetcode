class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] rmax=new int[n];
        rmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],height[i]);
        }
        int lmax=0;
        int total=0;
        for (int i=0;i<n;i++){
            lmax=Math.max(lmax,height[i]);
            total+=Math.min(lmax,rmax[i])-height[i];
        }
        return total;
    }
}