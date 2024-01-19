package Leetcode.Array;

public class MaxConsecutiveOnes2 {
/*
This time the question is asking return the maximum number of consecutive 1 meaning
allow change one 0 number to 1 , counting the maximum length of continuing 1

So the idea is set a value call countZero , if countZero bigger then 1 , we need to move left pointer forward so countZero need to subtract to refresh

As usual , create a value call max the count max sliding window (right - left + 1)
 */
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0 , countZero = 0 , max = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) countZero++;

            while (countZero > 1) {
                if (nums[left] == 0) {
                    countZero--;
                }
                left++;
            }
            max = Math.max(max , right - left + 1);
        }
        return max;
    }

}
