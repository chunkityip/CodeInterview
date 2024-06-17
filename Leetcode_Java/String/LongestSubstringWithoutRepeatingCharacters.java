package Leetcode_Java.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
    HashMap version:
    Since we are check duplicate character , we can create HashMap for store character key  ,the showing time of character as value

    if HashMap contains the key right pointer already , we will use sliding window algorithms which sliding the left pointer as left++ and remove character left key and value

    */
    public int lengthOfLongestSubstringHashMap(String s) {
        int left = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);

            while (map.containsKey(r)) {
                map.remove(s.charAt(left));
                left++;
            }

            map.put(r, map.getOrDefault(r, 0) + 1);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    /*
    HashSet version:
    HashSet can also do the job.
    Keep adding the character right pointer into HashSet so the position of right pointer in int array will become 1
    if the position of right pointer bigger than 0 , we find the duplicate character , so we need to sliding the window for left pointer ++ and remove index left in int array
    Finally , return the maximum length by return the size of set
     */


    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0 , right = 0;
        int max = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            if (!set.contains(r)) {
                set.add(r);
                right++;
                max = Math.max(max, right - left);
            } else {
                char l = s.charAt(left);
                set.remove(l);
                left++;
            }
        }
        return max;
    }
    /*
    Instead of creating Hashing , we can create Frequencies' array
    Commonly used tables are:

    - `int[26]`for Letters 'a' - 'z' or 'A' - 'Z'
    - `int[128]`for ASCII
    - `int[256]`for Extended ASCII

    **Noted***
    for Letters 'a' - 'z' or 'A' - 'Z' , substring[s.charAt(right) - 'a']++ may work.
    But for ASCII or Extended ASCII , it wouldn't

     */
    public int lengthOfLongestSubstringArray(String s) {
        int left = 0, max = 0;
        int[] substring = new int[128]; // Assuming ASCII characters

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Check if the current character is already in the substring
            while (substring[currentChar] > 0) {
                // Shrink the window from the left side
                substring[s.charAt(left)]--;
                left++;
            }

            // Increment the count of the current character in the substring
            substring[currentChar]++;

            // Update the maximum length
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
