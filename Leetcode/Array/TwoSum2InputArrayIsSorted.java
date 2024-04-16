package Leetcode.Array;

public class TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        // Using two pointers to search for the target number in three situations:
        // 1. If the sum of numbers at pointers i and j equals the target, create a new array to return their indices + 1.
        // 2. If the sum of numbers at pointers i and j (with j as the maximum number) is smaller than the target, move pointer i to the right.
        // 3. If the sum of numbers at pointers i and j (with j as the maximum number) is greater than the target, move pointer j to the left.


        int i = 0 , j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1 , j + 1};
                // Move i to the right to consider a larger number
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                // Move j to the left to consider a smaller number
                j--;
            }
        }

        //Since the question showed "there is exactly one solution" , so just throw whatever array
        return new int[] {-1 , - 1};
    }
}
