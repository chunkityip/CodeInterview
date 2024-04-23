package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }

    public List<List<Integer>> kSum(int[] nums, long target, int left, int k) {
        List<List<Integer>> list = new ArrayList<>();

        // Base case
        if (left == nums.length) return list;


        // It will have k values (this time k = 4) to add. Therefore, the average must be less than target / k
        // Using long since it may have digit numbers like 1.4 but using int will remove the digit numbers
        long average = target / k;
        int right = nums.length - 1;

        // If left pointer of nums is bigger than average, OR
        // if average is bigger than right pointer, an array of all the unique quadruplets can't be done m return empty List
        if  (nums[left] > average || average > nums[right]) {
            return list;
        }

        if (k == 2) {
            return twoSum(nums, target, left);
        }

        for (int i = left; i < nums.length; i++) {
            // Making sure they are unique
            if (i == left || nums[i - 1] != nums[i]) {
                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    // Below line adds each element of the subsets in subSet to the list containing -2. For example:
                    // After adding [-1, 1], the list becomes [-2, -1, 1].
                    // After adding [1, 2], the list becomes [-2, -1, 1, 1, 2].
                    list.add(new ArrayList<>(Arrays.asList(nums[i])));
                    list.get(list.size() - 1).addAll(subset);
                }
            }
        }

        return list;
    }

    public List<List<Integer>> twoSum(int[] nums, long target, int left) {
        List<List<Integer>> list = new ArrayList<>();
        int l = left, r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];

            //If sum is smaller than target , OR
            //left position element and prev left position element is same , left go forward
            if (sum < target || (l > left && nums[l] == nums[l - 1])) {
                l++;
                //If sum is greater than target , OR
                //right position element and next right position element is same , right go backward
            } else if (sum > target || (r < nums.length - 1 && nums[r] == nums[r + 1])) {
                r--;
            } else {
                list.add(Arrays.asList(nums[l++], nums[r--]));
            }
        }

        return list;
    }
}
