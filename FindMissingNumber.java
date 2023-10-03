public class FindMissingNumber {
    /*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
    find the one that is missing from the array.
    */

    //Input:  [3, 0, 1]
    //Output: 2

    public static void main (String[] args) {
        int [] nums = {3 , 0 , 1};
        System.out.println(findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int expectedSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            expectedSum += i;
        }

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
