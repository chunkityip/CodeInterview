package Leetcode.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    //left++ , max , and right++ in the for loop

    //Add character into HashMap

    //If there have repeating character (left pointer) in the HashMap
    //The beginning of sliding window (left pointer) will shift forward so the current repeating character are no longer in the window
    //For example
     /*
        a b c a b
        ^     ^
        l     r

        //there have two 'a' , so left pointer point to left ,and right keep forward as right++

        a b c a  b
          ^   ^
          l   r

        and using max to compare the length of sliding window
        */

    public int lengthOfLongestSubstring(String s) {
        int left = 0 , max = 0;
        Map<Character , Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            map.put(r , map.getOrDefault(r , 0) + 1);

            while (map.get(r) > 1) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                left++;
            }

            max = Math.max(max , right - left + 1);
        }
        return max;
    }



    /*
    Actually , we don't need to loop over two times.

        If there have repeating character (left pointer) in the HashMap
        The beginning of sliding window (left pointer) will shift value of this repeating character
        For example

        a b c a b                      a b c a b
        ^     ^          ->              ^   ^
        l     r                          l   r

        Key   Value                     Key Value
        a     0 + 1 = 1                 a   3 + 1 = 4

        The value inside the index of left pointer moving to (right + 1)

        So next time we will see 'a' again , for example
        a b c a b a                     a b c a b a
              ^   ^          ->                   ^   ^
              l   r                               l   r

        and using max to compare the length of sliding window

    */
    public int lengthOfLongestSubstringOptimized(String s) {

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
