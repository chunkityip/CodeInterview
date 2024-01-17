package Leetcode.Array;

public class MaxConsecutiveOnes {
    /*
    The whole idea is to count the maximum length of how many 1 continue
    We can set two counter:
    counter count  for counting 1 ,
    counter maxLen for if the current index isn't 1 , that counter compare which counter is larger and then reset count counter
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxLen = Math.max(maxLen , count);
                count = 0;
            }
        }
        //In case the else statement didn't execute
        //Meaning the last index is 1
        return Math.max(maxLen , count);
    }
}
