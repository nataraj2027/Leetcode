import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        int count = 0;

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Find top k frequent elements
        for (int i = 0; i < k; i++) {

            int max = Integer.MIN_VALUE;
            int maxKey = 0;

            // Find the key having maximum frequency
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            // Store the element (not the frequency)
            res[count] = maxKey;
            count++;

            // Remove it so that next maximum can be found
            map.remove(maxKey);
        }

        return res;
    }
}