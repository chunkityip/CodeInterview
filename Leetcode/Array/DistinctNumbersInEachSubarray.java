package Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class DistinctNumbersInEachSubarray {
    /*
    The idea is to each substring into HashMap
    Key will be the current index value , and value will be size of value
    */
    public int[] distinctNumbers(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Check if the current window size is greater than k
            if (right - left >= k) {
                //Since HashMap didn't allow any duplicate , the size of unique substring length will be our answer
                ans[left] = map.size();
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            // Update the frequency of the current number in the HashMap
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
        }

        // Handle the last sub-array separately
        ans[left] = map.size();

        return ans;
    }
}
