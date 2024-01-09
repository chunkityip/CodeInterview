package Leetcode.Array;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];

        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
        }

        //We are adding second nums array after the first array
        //So we need to i + len to make sure the index is right
        for (int i = 0; i < len; i++) {
            ans[i + len] = nums[i];
        }

        return ans;
    }
}
