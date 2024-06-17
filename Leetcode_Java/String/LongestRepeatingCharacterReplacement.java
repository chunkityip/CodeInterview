package Leetcode_Java.String;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    /* Variable Sized Window


        The main idea is the following math: if (right - left + 1 - maxC > k)
        It means : The length of window + 1 (since index start from 0) - max (the number of same number) > k

        Let me explain this main:
        If the length of sliding window subtract the repeat time of duplicated number , the only number left will be the number of different number
        And if the number of different number is bigger than k , we need to move the left pointer to keep the window sliding

        and finally as usual : the maximum length of window will be the answer
     */

    public int characterReplacement(String s, int k) {
        Map<Character , Integer> map = new HashMap<>();
        int left = 0 , max = 0 , ans = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right) , 0) + 1);

            //max is to count the max repeating character
            max = Math.max(max , map.get(right));

            //If the length of sliding window substring max repeating character ,
            //then the left over will be the one we like to use k to replace the character
            //For example : AABABBA. Let say the right move to 4 which is the second B : AABA(B : : Right point is here)BA
            //right as 4 - left as 0 + 1 - max as 3 = 2 AND 3 > k which as 1
            //So we slide left pointer by 1 and remove index left char in HashMap
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
        int left = 0, right = 0;
        int maxLength = 0;
        int maxCount = 0;

        int[] count = new int[26];

        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount , count[s.charAt(right) - 'A']);

            //K Out of bound , sliding window
            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength , right - left + 1);
            right++;
        }
        return maxLength;
    }
}
