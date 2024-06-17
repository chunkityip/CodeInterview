package Leetcode_Java.Array;

public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        //Update max to first k elements
        max = sum;

        //We are sliding the window
        //By adding index and substring index left - k at the same time
        //For example : left = 4 , left - k = 0 , we are removing index 0 and add index 4 at the same time
        for (int left = k; left < nums.length; left++) {
            sum += nums[left] - nums[left - k];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}
