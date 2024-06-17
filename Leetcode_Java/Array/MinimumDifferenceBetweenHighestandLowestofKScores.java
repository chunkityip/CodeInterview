package Leetcode_Java.Array;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public int minimumDifference(int[] nums, int k) {
        //Base case
        if (nums.length == 1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int compare = nums[i + k - 1] - nums[i];
            min = Math.min(min , compare);
        }
        return min;
    }
}
