package Leetcode.Array;

import java.util.HashSet;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //The k is talking about the length of window

        if (nums.length < 2) return false;

        HashSet<Integer> set = new HashSet<>();
        int left = 0 , right = 0;

        while (right < nums.length) {
            if (set.size() > k) {
                set.remove(nums[left]);
                left++;
            }

            if (set.contains(nums[right])) return true;

            set.add(nums[right]);
            right++;
        }
        return false;
    }
}
