package Leetcode_Java.Array;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        //To square a number, multiply the number by itself
        int len = nums.length;
        int[] result = new int[len];
        int left = 0 , right = len - 1;

        //Compare which one is negative , left or right
        //ignore negative number , add positive into result to insure the sorting order
        for (int i = right; i >= 0; i--) {
            int squre;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                squre = nums[right];
                right--;
            } else {
                squre = nums[left];
                left++;
            }
            result[i] = squre * squre;
        }
        return result;
    }
}
