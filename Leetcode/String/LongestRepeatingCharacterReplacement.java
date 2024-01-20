package Leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    /* Variable Sized Window


        The main idea is the following math: if (right - left + 1 - maxC > k)
        It means : The length of window + 1 (since index start from 0) - max (the number of same number) > k

        Let me explain this main:
        If the length of sliding window subtract the number of same number , the only number left will be the number of different number
        And if the number of different number is bigger than k , we need to move the left pointer to keep the window sliding

        and finally as usual : the maximum length of window will be the answer
     */

    public int characterReplacement(String s, int k) {
        Map<Character , Integer> map = new HashMap<>();
        int left = 0 , max = 0 , ans = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right) , 0) + 1);
            max = Math.max(max, map.get(s.charAt(right)));

            // If the length of window substact max is bigger then k, sliding the window
            if (right - left + 1 - max > k) {
                map.put(s.charAt(left) , map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

// Since the English letter have 26 character , we can actually use [[Frequencies array]] to store it


    public int characterReplacement2(String s, int k) {
        int[] arr = new int[26];
        int left = 0;
        int maxCount = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, arr[s.charAt(right) - 'A']);

            // If the length of window substact max is bigger then k, sliding the window
            if (right - left + 1 - maxCount > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
