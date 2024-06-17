package Leetcode_Java.Array;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {

    public int maxFrequency(int[] nums, int k) {
        /*
    The point is to return max frequency.
    You can change index but can only change in k times, which mean K is your limit bank to change a number

    Take example 1 :
    1 + 3 = 4 , we are using k as 5 subtract 3 which only 2 left
    2 + 2 = 4 , we are using k as 2 substract 2 which have nothing left

    So we return the length of sliding window

    So when we add the biggest index (4) * the length of sliding window (3) substract the sum of current number (4 + 3 + 2) ,
    the number will be how many we use at the K limit bank
        */
            Arrays.sort(nums);
            int left = 0,  max = 0 , currSum = 0;

            for(int right = 0; right < nums.length; right++){
                int target = nums[right];
                currSum += target;

                while((right - left + 1) * target - currSum > k){
                    currSum -= nums[left];
                    left++;
                }
                max = Math.max(max, right - left + 1);
            }
            return max;
        }
}
