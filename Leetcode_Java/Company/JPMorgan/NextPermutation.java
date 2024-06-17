package Leetcode_Java.Company.JPMorgan;

public class NextPermutation {
    //This question is highly asked in JPMorgan

    // The approach involves examining the last length index (i) and comparing it to the previous index (j).
    // 1. If i is smaller than j, i decrements, allowing us to identify the range of interest.
    // 2. A new pointer j is created, starting at the last index. It moves backward until nums[j] is smaller than nums[i].
    // 3. When found, the values at indexes i and j are swapped.
    // 4. Subsequently, the elements between i+1 and the last index are reversed to achieve the next smallest arrangement.
    // 5. If the last index can't find any smaller number, it means the range is already the maximum arrangement, and the array must be rearranged into the lowest possible order.

    public void nextPermutation(int[] nums) {
    //Base case
    int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
        i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums , i ,j);
        }
        reverse(nums , i + 1 , nums.length - 1);
    }

    private void swap(int[] nums , int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums , int i , int j) {
        while (i < j) {
            swap(nums , i++ , j--);
        }
    }
}
