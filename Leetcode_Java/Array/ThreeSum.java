package Leetcode_Java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //The problem is asking for 0 as summing 3 integer
        //Therefore, first element as pointer i must be equals or less then 0
        //If not , it wasn't 3Sum , go to next pointer or return empty Array
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                threeSum(nums , i , arr);
            }
        }
        return arr;
    }

    private void threeSum(int[] nums , int i , List<List<Integer>> arr) {
        //Think of j as left pointer + 1 and k as last pointer
        int j = i + 1 , k = nums.length - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum < 0) {
                j++;
            } else if (sum > 0) {
                k--;
            } else {
                arr.add(Arrays.asList(nums[i] , nums[j++] , nums[k--]));
                //making sure j pointer and k pointer elements are not have same
                //making sure j pointer and prev pointer elements are not have same
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }
    }
}
