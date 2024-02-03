package Leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {

    public int maximumUniqueSubarray(int[] nums) {
        int left = 0 , max = 0 , currCount = 0;
        Set<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currCount -= nums[left];
                left++;
            }

            set.add(nums[right]);
            currCount += nums[right];
            max = Math.max(max , currCount);
        }

        return max;
    }
}
