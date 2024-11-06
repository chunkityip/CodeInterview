package Leetcode_Java.Array;

public class RemoveElement {
    public static void main (String[] args) {
        int[] nums = {3 , 2 , 2 , 3};
        int val = 3;
        System.out.println(removeElement(nums, val)); //Output : 2
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n : nums) {
            if (n != val) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
