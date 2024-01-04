package Leetcode.String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                ans = Math.max(ans , set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}
