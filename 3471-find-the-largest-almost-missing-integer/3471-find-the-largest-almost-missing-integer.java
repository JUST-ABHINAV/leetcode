import java.util.*;

class Solution {
    public int largestInteger(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        if (k == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (map.get(arr[i]) == 1) {
                    max = Math.max(max, arr[i]);
                }
            }
        }
        
        else if (k == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
        }
        
        else {
            if (map.get(arr[0]) == 1) {
                max = Math.max(max, arr[0]);
            }
            
            if (map.get(arr[arr.length - 1]) == 1) {
                max = Math.max(max, arr[arr.length - 1]);
            }
        }
        
        return max;
    }
}