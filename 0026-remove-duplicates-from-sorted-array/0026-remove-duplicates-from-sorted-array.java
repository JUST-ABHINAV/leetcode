class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length==1)return 1;
      int left=0;
      int right=1;
      int k=1;
      while (right<arr.length){
            if (arr[right]==arr[left])right++;
            else if (arr[right]!=arr[left]){
                left++;
                arr[left]=arr[right];
                k++;
                }
      }
      return k;
    }
}