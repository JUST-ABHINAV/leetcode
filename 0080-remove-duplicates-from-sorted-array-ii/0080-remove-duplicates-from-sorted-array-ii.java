class Solution {
    public int removeDuplicates(int[] arr) {
         if (arr.length <= 2) return arr.length;

        int left = 2;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[left - 2]) {
                arr[left] = arr[i];
                left++;
            }
        }

        return left;
    }
}