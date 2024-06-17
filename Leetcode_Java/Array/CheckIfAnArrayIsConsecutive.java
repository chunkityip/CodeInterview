package Leetcode_Java.Array;

import java.util.Arrays;

public class CheckIfAnArrayIsConsecutive {
    /*
    We can use sorting so the number will be ascending order
    We set the loop integer i as 1 because we want to compare index 1 and index 0 to
    avoid indexOutOfBound exception.

    What we need to do is see if current index - 1 same as previous index.
    if yes , return true , if no , return no
     */
    public boolean isConsecutive(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 != nums[i - 1]) return false;
        }
        return true;
    }
}
