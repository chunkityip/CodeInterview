package Leetcode.Array;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0 , high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //A situation if the beginning index already is target
        if (low < nums.length && nums[low] == target) {
            return low;
        } else {
            return -1;
        }
    }
}
