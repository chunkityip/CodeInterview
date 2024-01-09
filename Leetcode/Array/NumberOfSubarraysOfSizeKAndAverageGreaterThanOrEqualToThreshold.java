package Leetcode.Array;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 , ans = 0;
        int left = 0, right = 0;

        while (right < arr.length) {
            sum += arr[right];
            if (right - left + 1 < k) {
                right++;
            } else if (right - left + 1 == k) {
                int avg = sum / k;
                if (avg >= threshold) {
                    ans++;
                }
                sum -= arr[left];
                left++;
                right++;
            }
        }
        return ans;
    }
}
