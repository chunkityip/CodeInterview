package Leetcode.Array;

public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // Calculate the initial sum for the first k elements
        int left = 0;
        int right = k;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;
        // Use a while loop to slide the window
        /*
        Initial Window: [ 1, 12, -5, -6 ] (sum is calculated for this window)
                          |
                        left
        sum - nums[left] meaning remove 1

        After sliding the window to the right:
                    [ 12, -5, -6, 50 ] (update sum by subtracting 1 and adding 50)
                      |            |
                    left++        right

        */
        while (right < nums.length) {
            sum = sum - nums[left] + nums[right];
            max = Math.max(sum, max);

            left++;
            right++;
        }

        // Return the maximum average
        return max / k;
    }
}
