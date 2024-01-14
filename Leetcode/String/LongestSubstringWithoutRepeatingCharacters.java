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

    //Using HashMap to store key as character , index as value
    //If we found the repeating character , the left point will jump to right pointer
    //a b c a b c b b
    //map didn't contains a as key , a's value + 1
    //map didn't contains b as key , b's value + 1
    //map didn't contains c as key , c's value + 1
    //map did contains b as key , a's value jump to this a index (3) , store it to max
    //....


    public int lengthOfLongestSubstring(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0 , ans = 0;

        for (int right = 0; right < s.length(); right++) {
            //If we found the repeating character , the left point will jump to right pointer
            //By comparing which one is bigger : right or left
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) , left);
            }

            ans = Math.max(ans , right - left + 1);
            map.put(s.charAt(right) , right + 1);
        }

        return ans;

    }
}
