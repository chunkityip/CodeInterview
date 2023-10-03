public class LargestNumber {
    //Write a program to find the largest number in an array in Java.
    //Input : int[] nums = {1, 5, 3, 9, 7};
    //Output : 9

    public static void main (String[] args) {
        int[] nums = {1, 5, 3, 9, 7};
        System.out.println(findLargest(nums));
    }

    public static int findLargest(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }
}
