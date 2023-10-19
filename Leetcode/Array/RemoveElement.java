package Leetcode.Array;

public class RemoveElement {
    public static void main (String[] args) {
        int[] nums = {3 , 2 , 2 , 3};
        int val = 3;
        System.out.println(removeElement(nums, val)); //Output : 2
    }

    public static int removeElement(int[] nums, int val) {
        //Base case
        if (nums.length == 0) return 0;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
