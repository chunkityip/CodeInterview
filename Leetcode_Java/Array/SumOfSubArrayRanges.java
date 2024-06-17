package Leetcode_Java.Array;

public class SumOfSubArrayRanges {
    //This question is highly asked in JPMorgan

    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        long ans = 0;

        for (int left = 0; left < len; left++) {
            int min = left , max = left;
            for (int right = left; right < len; right++) {
                min = Math.min(nums[right] , min);
                max = Math.max(nums[right] , max);
                ans += max - min;
            }
        }
        return ans;
    }
}
