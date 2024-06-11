package Leetcode.Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0 , high = nums.length - 1;

        //base case
        if (nums[low] == target) return low;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else  {
                low = mid + 1;
            }
        }
        return low;
    }
}
