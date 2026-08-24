class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int k=0;int j=n;
        int i=0;
        while (i<2*n){
            arr[i]=nums[k];
            k++;i++;
            arr[i]=nums[j];
            j++;i++;
        }
        return arr;
    }
}