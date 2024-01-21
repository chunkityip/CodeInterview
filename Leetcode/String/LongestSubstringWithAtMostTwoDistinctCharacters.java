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
        //Using HashMap to store key and value
        Map<Character, Integer> map = new HashMap<>();
        //left pointer and the ans later to compare the max of length
        int left = 0, ans = 0;

        //looping thu the length of s and set right pointer
            for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right) , 0) + 1);

            //Checking is the size of HashMap bigger than 2
            if (map.size() > 2) {
                //remove the value of left by 1
                map.put(s.charAt(left) , map.get(s.charAt(left)) - 1);
                //remove index left of char in map if the value is 0. Meaning there is no such char in the map , remove it.
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            //Comparing the length , we need to add 1 since the index start from 0
            ans = Math.max(ans , right - left + 1);
        }
            return ans;
    }
}
