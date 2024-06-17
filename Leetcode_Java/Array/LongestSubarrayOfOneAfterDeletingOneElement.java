package Leetcode_Java.Array;

public class LongestSubarrayOfOneAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        //Using a countZero value to count how many zero
        //if current index is 0 , countZero++

        //while cutZero > 1 meaning we have zero
        //removing the left point to 1

        int left = 0 , max = 0, countZero = 0;
        for (int right = 0; right < nums.length; right++) {
            countZero += (nums[right] == 0 ? 1 : 0);

            while (countZero > 1) {
                countZero -= (nums[left] == 0 ? 1 : 0);
                left++;
            }

            //We are not adding 1 since we must deelete one element
            max = Math.max(max , right - left);
        }
        return max;
    }
}
