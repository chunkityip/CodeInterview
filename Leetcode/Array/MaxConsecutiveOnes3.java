package Leetcode.Array;

public class MaxConsecutiveOnes3 {

    /*
    Re-study
    So again we set a value call countZero , if countZero is bigger than k ,
    left pointer need to move forward and reset countZero subtract by one.
     */
    public int longestOnes(int[] nums, int k) {
        int left = 0 , countZero = 0 , max = 0;

        for (int right = 0; right < nums.length; right++) {
            countZero += (nums[right] == 0 ? 1 : 0);

            while (countZero > k) {
                countZero -= (nums[left] == 0 ? 1 : 0);
                left++;
            }
            max = Math.max(max , right - left + 1);
        }
        return max;
    }
}
