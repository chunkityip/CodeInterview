package Leetcode_Java.Array;

public class RemoveDuplicatesFromSortedArray {

    public static void main (String[] args) {
        int[] input = {1 , 1 , 2};
        System.out.println(removeDuplicates(input));  //Output : 2
    }

    public static int removeDuplicates(int[] nums) {
        //Base case
        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

