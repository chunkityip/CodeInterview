package Leetcode.String;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostTwoDistinctCharacters {

    /*
        Variable sized window question
        The part of this question is about "most two distinct characters". It means the length of window can't be larger than 3
        So when we are using map to store , if the size of map > 2 , we need to remove the left pointer of window.
        Also , the value of left need to subtract by one since we are removing the left point of character
        If the value of left pointer is 0 , we need to remove it so new left pointer can adding on it.

        */
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left = 0 , max = 0;
        Map<Character , Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            map.put(r , map.getOrDefault(r , 0) + 1);

            while(map.size() > 2) {
                char l = s.charAt(left);
                if (map.containsKey(l)) {
                    map.put(l , map.get(l) - 1);
                }
                if (map.get(l) == 0) map.remove(l);
                left++;
            }

            max = Math.max(max , right - left + 1);
        }
        return max;
    }
}
