package Leetcode.Array;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    //Two loop version
    public int numOfSubarrays1(int[] arr, int k, int threshold) {
        int sum = 0 , output = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum / k >= threshold) output++;

        for (int left = k; left < arr.length; left++) {
            sum += arr[left] - arr[left - k];
            if (sum / k >= threshold) output++;
        }
        return output;
    }

    //One loop version
    public int numOfSubarrays2(int[] arr, int k, int threshold) {
        int sum = 0 , output = 0;
        // Calculate the sum of the first k elements
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the sum
            sum += arr[i];

            // If we have more than k elements in the sum, subtract the first element
            if (i >= k) {
                sum -= arr[i - k];
            }

            // If we have at least k elements in the sum, check if the average meets the threshold
            if (i >= k - 1 && sum / k >= threshold) {
                output++;
            }
        }
        return output;
    }
}
