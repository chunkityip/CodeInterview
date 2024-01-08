package Leetcode.String;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0;
        int maxCount = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, arr[s.charAt(right) - 'A']);

            // If the window size - maxCount exceeds k, shrink the window
            if (right - left + 1 - maxCount > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
