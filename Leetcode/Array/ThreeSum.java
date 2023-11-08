package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                compare(nums , i , arr);
            }
        }
        return arr;
    }

    private void compare (int[] nums , int i , List<List<Integer>> arr) {
        int j = i + 1 , k = nums.length - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum < 0) {
                j++;
            } else if (sum > 0) {
                k--;
            } else {
                arr.add(Arrays.asList(nums[i] , nums[j++] , nums[k--]));
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }
    }
}
