package Leetcode.Array;

public class MaxConsecutiveOnes2 {
/*
This time the question is asking return the maximum number of consecutive 1 meaning
allow change one 0 number to 1 , counting the maximum length of continuing 1

So the main idea is set a value call countZero , if countZero bigger than 1 , we need to check is the current left index is 0.
If yes , move left pointer forward so countZero need to subtract to refresh Since once the number is 0 , there are no longer consecutive substring**

As usual , create a value call max the count max sliding window (right - left + 1)
 */
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0 , countZero = 0 , max = 0;

        for (int right = 0; right < nums.length; right++) {
            countZero += (nums[right] == 0 ? 1 : 0);

            while (countZero > 1) {
                countZero -= (nums[left] == 0 ? 1 : 0);
                left++;
            }
            max = Math.max(max , right - left + 1);
        }
        return max;
    }
}
