package Leetcode.String;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
        Sliding Window from left (first index) to right (also first index)
        Also using HashMap , key as char and value as index
        if char right is in the HashMap , left move to the value of key index j so we can skip the repaeating character

        We are comparing ans , should it be original ans or right - left + 1 (+ 1 is to fix the index 0)

        Don't forget add right into HashMap
     */

    /*
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
     */

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0 , ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) , left);
            }
            ans = Math.max(ans , right - left + 1);
            map.put(s.charAt(right) , right + 1);
        }

        return ans;

    }
}
