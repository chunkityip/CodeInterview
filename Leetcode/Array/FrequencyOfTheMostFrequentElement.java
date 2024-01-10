package Leetcode.Array;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {

    public int maxFrequency(int[] nums, int k) {
        /*

        k is the budget we are allowing to increment the element
        For example : 1 ,2, 4 , k = 5
        1 + 3 = 4 , so k - 3 = 2
        2 + 2 = 4 , so k - 2 = 0 , we are run out of budget
        Now the nums is 4 , 4 , 4 , we have 4 three times

        So the idea is having two pointers , left and right , both point to index 0 at the beginning
        right will keep forward and store in integer target
        We create a long call currSum keep sum up target
        then using this : if ((right - left + 1) * target - currSum > k) to decide should we move left forward or not
        Let's anayzle it:
        1 , 4 , 8 , 13

        1a. left and right both point to index 0 as 1 , so target is 1 and currSum is also 1
        1b. is (0 - 0 + 1 as 1) * 1 - 1 > 5 ? No , we still have the budget , right move forward
        1c. we crate a integer ans = compare the biggest frequney as ans and (right - left + 1) , 1 > 0 , now ans is 1

        2a. right point to index 1 as 4 , so target is 4 and currSum is 5 as 1 + 4
        2b. is (1 - 0 + 1 as 2) * 4 - 5 > 5 ? No , 3 !> then 5. As you can see , we use 3 to increse 1 to 4 , now we are 4 ,4 , 8 , 13 and budget is 2
        2c. Compare ans and (right - left + 1 as 2) , 2 > 1 , now ans is 2

        3a. right point to index 2 as 8, so target is 8 and currSum is 13 as 8 + 5
        3b. is (2 - 0 + 1 as 3) * 8 - 13 > 5 ? yes , As you can see , the budget is 2 and we can't increase both 1 and 4 to 8 only using 2
        3c. left point move forward
        .
        .
        .

        Using two pointers , left and right , both point to index 0
        Create a integer call target to store current index value
        Create a interger call ans to compare the biggest frequency
        Create a long call currSum to compare current sum value

        In the while loop of right < nums.length
        keep adding currSum until :

        if (right - left + 1) * target - currSum > k
        we subtract nums[left] from currSum and left move forward

        We are comparing  the biggest frequney as ans and (right - left + 1)

        return ans;
        */

            int maxFrequency = 0; // Initialize the maximum frequency
            long currentSum = 0; // Initialize the current sum of the subarray elements

            Arrays.sort(nums); // Sort the array in ascending order

            for (int left = 0, right = 0; right < nums.length; ++right) {
                currentSum += nums[right]; // Include the current element in the subarray sum

                // Check if the current subarray violates the condition (sum + k < nums[right] * length)
                while (currentSum + k < (long) nums[right] * (right - left + 1)) {
                    currentSum -= nums[left]; // Adjust the subarray sum by removing the leftmost element
                    left++; // Move the left pointer to the right
                }

                // Update the maximum frequency based on the current subarray length
                maxFrequency = Math.max(maxFrequency, right - left + 1);
            }

            return maxFrequency;
        }
}
