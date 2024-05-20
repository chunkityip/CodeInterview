package Leetcode.Array;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = 0;
        int max = 0;
        int sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            //We have k number of sub-arrays
            if (right - left + 1 == k) {
                //If the avarge of sub-arrays is greater than or equal to Threshold
                if (sum / k >= threshold ) {
                    max++;
                }
                //sliding window as moving left point forward
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return max;
    }
}
