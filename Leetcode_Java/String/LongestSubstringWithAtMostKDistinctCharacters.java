package Leetcode_Java.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        /*
        Variable Sized Window
        The important part of this question is " contains at most k distinct characters". Meaning the length of window can't larger than K
        So we use HashMap to store char as key , the number of showing as value
        Using two pointer , left and right

        loop thu the n of length
        Adding character of index right as key , the number of showing as value

        if the size of map is bigger then k , we need to do the following:
        1. subtract the value of index left to 1 since we want to sliding the window as left pointer ++
        2. Since we are looking for the Most K Distinct Characters , if we found the value of index left is 0 , remove it
        3. left pointer ++ so the window is sliding

        And finally we are comparing which one is bigger : ans or right - left + 1 (Since the index start with 0 , we need to add 1)
        return ans
        */

        Map<Character , Integer> map = new HashMap<>();

        int left = 0 , ans = 0;
        for (int right = 0; right < s.length() ; right++) {
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right) , 0) + 1);

            if (map.size() > k) {
                map.put(s.charAt(left) , map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            ans = Math.max(ans , right - left + 1);
        }
        return ans;
    }
}
