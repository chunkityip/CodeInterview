package Leetcode.Array;

public class MinimumOperationstoReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        int left = 0 , max = -1 , sum = 0 , currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            while (left <= right && currSum > sum - x) {
                currSum -= nums[left];
                left++;
            }
            if (currSum == sum - x) max = Math.max(max , right - left + 1);
        }

        return max == -1 ? -1 : nums.length - max;
    }
}
