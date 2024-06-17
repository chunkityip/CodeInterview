package Leetcode_Java.String;

public class FindKLengthSubstringsWithNoRepeatedCharacters {
    public int numKLenSubstrNoRepeats(String s, int k) {
        if (k > 26) return 0;

        int ans= 0 , left = 0;
        int arr[] = new int[26];

        for (int right = 0; right < s.length(); right++) {

            arr[s.charAt(right) - 'a']++;

            while (arr[s.charAt(right) - 'a'] > 1) {
                arr[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == k) {
                ans++;
                arr[s.charAt(left) - 'a']--;
                left++;
            }

        }
        return ans;
    }
}
